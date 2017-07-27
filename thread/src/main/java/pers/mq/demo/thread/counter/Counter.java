package pers.mq.demo.thread.counter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-07-27
 * Time: 下午5:39
 */
public class Counter {

    private long count = 0;

    public synchronized void add(long value) {
        this.count += value;
        System.out.println(Thread.currentThread().getName() + ":" + count);
    }
}
