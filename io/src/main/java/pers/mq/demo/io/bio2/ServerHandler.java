package pers.mq.demo.io.bio2;

import pers.mq.demo.io.utils.Calculator;

import javax.script.ScriptException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 客户端线程
 *
 * @author MQ
 */
public class ServerHandler implements Runnable {
    private Socket socket;

    public ServerHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        ) {
            String expression;
            String result = null;
            while (true) {
                if ((expression = br.readLine()) == null) {
                    break;
                }
                System.out.println("服务器收到消息:" + expression);
                try {
                    result = Calculator.evel(expression).toString();
                } catch (ScriptException e) {
                    System.out.println("计算错误:" + e.getMessage());
                }
                out.println(result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
