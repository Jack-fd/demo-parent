package pers.mq.demo.gof4.factorymethod;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-08-29
 * Time: 下午2:44
 */
public class Audi implements Car {

    @Override
    public void run() {
        System.out.println("奥迪在跑...");
    }
}
