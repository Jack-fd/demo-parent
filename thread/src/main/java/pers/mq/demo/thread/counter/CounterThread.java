package pers.mq.demo.thread.counter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-07-27
 * Time: 下午5:40
 */
public class CounterThread extends Thread {

    protected Counter counter = null;

    public CounterThread(Counter counter, String name) {
        this.counter = counter;
        this.setName(name);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.add(i);
        }
    }
}
