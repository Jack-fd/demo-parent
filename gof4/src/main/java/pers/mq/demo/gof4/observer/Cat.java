package pers.mq.demo.gof4.observer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-07
 * Time: 下午4:44
 */
public class Cat extends MySubject {

    @Override
    public void cry() {
        System.out.println("猫叫! ");
        System.out.println("--------------");
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).response();
        }
    }
}
