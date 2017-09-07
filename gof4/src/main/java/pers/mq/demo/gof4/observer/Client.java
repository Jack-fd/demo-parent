package pers.mq.demo.gof4.observer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-07
 * Time: 下午4:46
 */
public class Client {

    public static void main(String[] args) {
        MySubject subject = new Cat();
        subject.attach(new Mounse());
        subject.attach(new Dog());
        subject.cry();
    }
}
