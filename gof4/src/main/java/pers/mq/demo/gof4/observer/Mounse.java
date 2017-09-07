package pers.mq.demo.gof4.observer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-07
 * Time: 下午4:45
 */
public class Mounse implements MyObserver {

    @Override
    public void response() {
        System.out.println("老鼠努力逃跑！");
    }
}
