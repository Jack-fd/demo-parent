package pers.mq.demo.io.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * @author mq
 */
public class ClientHandle implements Runnable {

    private String host;
    private int port;
    private Selector selector;
    private SocketChannel socketChannel;
    private volatile boolean startd;

    public ClientHandle(String ip, int port) {
        this.host = ip;
        this.port = port;
        try {
            selector = Selector.open();
            socketChannel = SocketChannel.open();
            socketChannel.configureBlocking(false);
            this.startd = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void stop() {
        this.startd = false;
    }


    @Override
    public void run() {
        try {
            doConnect();
            while (startd) {
                selector.select(1000);
                Set<SelectionKey> keys = selector.selectedKeys();
                SelectionKey selectionKey = null;
                Iterator<SelectionKey> it = keys.iterator();
                while (it.hasNext()) {
                    selectionKey = it.next();
                    it.remove();
                    handleInput(selectionKey);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(selector != null) {
            try {
                selector.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void handleInput(SelectionKey selectionKey) throws IOException {
        if (selectionKey.isValid()) {
            SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
            if (selectionKey.isConnectable()) {
                if (!socketChannel.finishConnect()) {
                    System.exit(1);
                }
            }
            if (selectionKey.isReadable()) {
                ByteBuffer buffer = ByteBuffer.allocate(1024);
                int readByte = socketChannel.read(buffer);
                if (readByte > 0) {
                    buffer.flip();
                    byte[] bytes = new byte[buffer.remaining()];
                    buffer.get(bytes);
                    String result = new String(bytes, "UTF-8");
                    System.out.println("客户端收到消息:" + result);
                } else if (readByte < 0) {
                    selectionKey.cancel();
                    socketChannel.close();
                }
            }
        }
    }

    private void doConnect() throws IOException {
        if (socketChannel.connect(new InetSocketAddress(host, port))) {
        } else {
            socketChannel.register(selector, SelectionKey.OP_CONNECT);
        }
    }


    public void sendMsg(String msg) throws IOException {
        socketChannel.register(selector, SelectionKey.OP_READ);
        doWrite(socketChannel, msg);
    }

    private void doWrite(SocketChannel socketChannel, String msg) throws IOException {
        byte[] bytes = msg.getBytes();
        ByteBuffer byteBuffer = ByteBuffer.allocate(bytes.length);
        byteBuffer.put(bytes);
        byteBuffer.flip();
        socketChannel.write(byteBuffer);
    }
}
