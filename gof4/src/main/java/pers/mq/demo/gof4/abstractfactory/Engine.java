package pers.mq.demo.gof4.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-08-29
 * Time: 下午3:43
 */
public interface Engine {
    void run();
    void start();
}

class LuxuryEngine implements Engine {

    @Override
    public void run() {
        System.out.println("高级发动机跑的快...");
    }

    @Override
    public void start() {
        System.out.println("高级发动机启动快...");
    }
}

class LowEngine implements Engine {

    @Override
    public void run() {
        System.out.println("低级发动机跑的快...");
    }

    @Override
    public void start() {
        System.out.println("低级发动机启动快...");
    }
}