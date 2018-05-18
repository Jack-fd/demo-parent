package pers.mq.demo.io.bio;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * BIO服务器源码
 *
 * @author MQ
 */
public class ServerNormal {

    //默认的端口
    private static int DEFAULT_PORT = 12345;

    //单例的ServerSocket
    private static ServerSocket serverSocket;

    public static void start() throws IOException {
        start(DEFAULT_PORT);
    }

    private synchronized static void start(int port) throws IOException {
        if (serverSocket != null) {
            return;
        }
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("服务器已启动，端口号: " + port);
            while (true) {
                Socket socket = serverSocket.accept();
                new Thread(new ServerHandler(socket)).start();
            }
        } finally {
            if (serverSocket != null) {
                System.out.println("服务器关闭");
                serverSocket.close();
                serverSocket = null;
            }
        }
    }
}
