package pers.mq.demo.gof4.decorator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-06
 * Time: 下午5:21
 */
public class Robot extends Changer {

    public Robot(Transform transform) {
        super(transform);
    }

    public void say() {
        System.out.println("说话");
    }
}
