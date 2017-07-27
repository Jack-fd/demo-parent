package pers.mq.demo.thread;

/**
 * Created with IntelliJ IDEA. Description: User: mq Date: 2017-07-27 Time: 下午3:04
 */
public class ThreadExample {
    
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            new Thread("" + i) {
                public void run() {
                    System.out.println("Thread: " + getName() + " running");
                }
            }.start();
        }
    }
}
