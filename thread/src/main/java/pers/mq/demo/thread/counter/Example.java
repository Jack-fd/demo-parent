package pers.mq.demo.thread.counter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-07-27
 * Time: 下午5:42
 */
public class Example {

    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread threadA = new CounterThread(counter, "ThreadA");
        Thread threadB = new CounterThread(counter, "ThreadB");
        threadA.start();
        threadB.start();
    }
}
