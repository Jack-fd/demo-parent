package pers.mq.demo.gof4.simplefactory;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-08-29
 * Time: 下午2:44
 */
public class Byd implements Car {

    @Override
    public void run() {
        System.out.println("比亚迪在跑...");
    }
}
