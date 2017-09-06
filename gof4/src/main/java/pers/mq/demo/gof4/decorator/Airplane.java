package pers.mq.demo.gof4.decorator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-06
 * Time: 下午5:23
 */
public class Airplane extends Changer {

    public Airplane(Transform transform) {
        super(transform);
    }

    public void fly() {
        System.out.println("在天空飞翔");
    }
}
