package pers.mq.demo.io.nio;

import pers.mq.demo.io.utils.Calculator;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

import javax.script.ScriptException;

/**
 * @author mq
 */
public class ServerHandle implements Runnable {

    private Selector selector;
    private ServerSocketChannel serverSocketChannel;
    private volatile boolean startd;

    public ServerHandle(int port) {
        try {
            selector = Selector.open();
            serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.configureBlocking(false);
            serverSocketChannel.bind(new InetSocketAddress(port), 1024);
            serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
            startd = true;
            System.out.println("服务器已启动，端口号： " + port);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void stop() {
        this.startd = false;
    }


    @Override
    public void run() {
        while (startd) {
            try {
                selector.select(1000);
                Set<SelectionKey> keys = selector.selectedKeys();
                Iterator<SelectionKey> iterator = keys.iterator();
                SelectionKey key;
                while (iterator.hasNext()) {
                    key = iterator.next();
                    iterator.remove();
                    try {

                        handleInput(key);
                    } catch (Exception ex) {
                        if (key != null) {
                            key.cancel();
                            if (key.channel() != null) {
                                key.channel().close();
                            }
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
        if (selector != null) {
            try {
                selector.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void handleInput(SelectionKey key) throws IOException, ScriptException {
        if (key.isValid()) {
            if (key.isAcceptable()) {
                ServerSocketChannel serverSocketChannel = (ServerSocketChannel) key.channel();
                SocketChannel sc = serverSocketChannel.accept();
                sc.configureBlocking(false);
                sc.register(selector, SelectionKey.OP_READ);
            }
            if (key.isReadable()) {
                SocketChannel socketChannel = (SocketChannel) key.channel();
                ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                int readBytes = socketChannel.read(byteBuffer);
                if (readBytes > 0) {
                    byteBuffer.flip();
                    byte[] bytes = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bytes);
                    String expression = new String(bytes, "utf-8");
                    System.out.println("服务器收到消息:" + expression);
                    Object result = null;
                    try {
                        result = Calculator.evel(expression);
                    } catch (ScriptException e) {
                        result = "计算错误:" + e.getMessage();
                    }
                    doWrite(socketChannel, result);

                } else if (readBytes < 0) {
                    key.cancel();
                    socketChannel.close();
                }
            }
        }
    }

    private void doWrite(SocketChannel socketChannel, Object result) throws IOException {
        byte[] bytes = result.toString().getBytes();
        ByteBuffer byteBuffer = ByteBuffer.allocate(bytes.length);
        byteBuffer.put(bytes);
        byteBuffer.flip();
        socketChannel.write(byteBuffer);
    }
}
