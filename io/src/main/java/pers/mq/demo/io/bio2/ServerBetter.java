package pers.mq.demo.io.bio2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * BIO服务器源码__伪异步I/O
 *
 * @author MQ
 */
public class ServerBetter {

    private static int DEFAULT_PORT = 12345;

    private static ServerSocket serverSocket;

    private static ExecutorService executorService = Executors.newFixedThreadPool(5);

    public static  void start() throws IOException {
        start(DEFAULT_PORT);
    }
    public synchronized static void start(int port) {
        if (serverSocket != null) {
            return;
        }
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("服务器已启动，端口号:：" + port);
            while (true) {
                Socket socket = serverSocket.accept();
                executorService.execute(new ServerHandler(socket));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (serverSocket != null) {
                System.out.println("服务器已关闭");
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                serverSocket = null;
            }
        }

    }
}
