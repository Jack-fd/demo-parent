package pers.mq.demo.io.nio;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * @author mq
 */
public class Test {

    public static void main(String[] args) throws Exception {
        Server.start();
        TimeUnit.MILLISECONDS.sleep(1);
        Client.start();
        while (Client.sendMsg(new Scanner(System.in).nextLine()));
    }
}
