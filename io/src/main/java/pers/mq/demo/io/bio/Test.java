package pers.mq.demo.io.bio;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Executors;

/**
 * BIO测试方法
 *
 * @author MQ
 * <p>
 * https://blog.csdn.net/anxpp/article/details/51512200
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Executors.newSingleThreadExecutor().execute(() -> {
            try {
                ServerBetter.start();
//                ServerNormal.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        Thread.sleep(100);
        char operators[] = {'+', '-', '*', '/'};
        Random random = new Random(System.currentTimeMillis());
        Executors.newSingleThreadExecutor().execute(() -> {
            while (true) {
                String expression = random.nextInt(10) + "" + operators[random.nextInt(4)] + random.nextInt(10);
                Client.send(expression);
                try {
                    Thread.sleep(random.nextInt(1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
