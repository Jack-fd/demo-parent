package pers.mq.demo.thread;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA. Description: User: mq Date: 2017-07-27 Time: 下午3:04
 */
@Slf4j
public class ThreadExample implements Runnable {

    private static Integer count = 0;

    private Lock lock;

    public ThreadExample(Lock lock) {
        this.lock = lock;
    }

    public static void main(String[] args) throws InterruptedException {
        Lock lock = new Lock();
        ThreadExample t = new ThreadExample(lock);
        for (int i = 0; i < 10; i++) {
            new Thread(t).start();
        }
        TimeUnit.SECONDS.sleep(2);
        System.out.println(count);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                lock.lock();
                ThreadExample.count += 1;
                lock.unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}


class Lock {

    private boolean islocked = false;

    public synchronized void lock() throws InterruptedException {
        while (islocked) {
            wait();
        }
        islocked = true;
    }

    public synchronized void unlock() {
        islocked = false;
        notify();
    }
}

