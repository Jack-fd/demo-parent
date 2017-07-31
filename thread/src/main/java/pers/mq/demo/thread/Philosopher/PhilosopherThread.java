package pers.mq.demo.thread.Philosopher;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * 5个哲学家，5跟筷子，哲学家必须用两只筷子吃东西。
 * 他们只能使用自己左右手边的那两只筷子。
 * 做到不产生死锁以及要求高并发性。
 * User: mq
 * Date: 2017-07-28
 * Time: 上午9:37
 */
@Slf4j
public class PhilosopherThread implements Runnable {

    private static int[] chopstick = {1, 1, 1, 1, 1};

    private Integer left;
    private Integer right;

    @Override
    public void run() {
        synchronized (PhilosopherThread.class) {
            while (left == null || right == null) {
                for (int i = 0; i < chopstick.length; i++) {
                    if (chopstick[i] > 0) {
                        left = i;
                        chopstick[i] = 0;
                        log.info("哲学家 {}, 左手拿到筷子 {}", Thread.currentThread().getName(), left);
                        break;
                    }
                }

                try {
                    TimeUnit.MICROSECONDS.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                for (int i = 0; i < chopstick.length; i++) {
                    if (chopstick[i] > 0) {
                        right = i;
                        chopstick[i] = 0;
                        log.info("哲学家 {}, 右手拿到筷子 {}", Thread.currentThread().getName(), right);
                        break;
                    }
                }
            }
            if (left != null && right != null) {
                log.warn("哲学家 {}, 开始吃饭。", Thread.currentThread().getName());
                try {
                    TimeUnit.MICROSECONDS.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                chopstick[left] = 1;
                chopstick[right] = 1;
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new PhilosopherThread()).start();
        }
    }
}
