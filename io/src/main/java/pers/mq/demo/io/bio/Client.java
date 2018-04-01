package pers.mq.demo.io.bio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 阻塞式I/O创建的客户端
 *
 * @author MQ
 */
public class Client {

    private static int DEFAULT_SERVER_PORT = 12345;
    private static String DEFAULT_SERVER_IP = "127.0.0.1";

    public static void send(String expression) {
        send(DEFAULT_SERVER_PORT, expression);
    }

    private static void send(int port, String expression) {
        System.out.println("算术表达式为:" + expression);
        try (
                Socket socket = new Socket(DEFAULT_SERVER_IP, port);
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        ) {
            out.println(expression);
            System.out.println("___结果为: " + br.readLine());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
