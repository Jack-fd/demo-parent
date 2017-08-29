package pers.mq.demo.gof4.factorymethod;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-08-29
 * Time: 下午2:47
 */
public class Client {

    public static void main(String[] args) {
        Car c1 = new AudiFactory().create();
        Car c2 = new BydFactory().create();
        Car c3 = new BydFactory().create();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
