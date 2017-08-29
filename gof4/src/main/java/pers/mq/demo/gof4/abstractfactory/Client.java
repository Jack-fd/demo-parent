package pers.mq.demo.gof4.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-08-29
 * Time: 下午4:57
 */
public class Client {

    public static void main(String[] args) {
        CarFactory c1 = new LuxuryCarFactory();
        CarFactory c2 = new LowCarFacotry();
        System.out.println(c1);
        System.out.println(c2);
    }
}
