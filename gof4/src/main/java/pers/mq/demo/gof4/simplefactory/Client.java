package pers.mq.demo.gof4.simplefactory;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-08-29
 * Time: 下午2:47
 */
public class Client {

    public static void main(String[] args) {
        Car c1 = CarFactory.createCar("奥迪");
        Car c2 = CarFactory.createCar("比亚迪");
        System.out.println(c1);
        System.out.println(c2);
    }
}
