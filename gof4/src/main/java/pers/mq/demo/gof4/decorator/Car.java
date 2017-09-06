package pers.mq.demo.gof4.decorator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-06
 * Time: 下午5:19
 */
public class Car implements Transform {

    public Car() {
        System.out.println("变形金刚是一辆车");
    }
    @Override
    public void move() {
        System.out.println("在陆地上移动");
    }
}
