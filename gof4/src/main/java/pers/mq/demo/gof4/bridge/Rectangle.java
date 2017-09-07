package pers.mq.demo.gof4.bridge;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-07
 * Time: 下午2:15
 */
public class Rectangle extends Shape {
    @Override
    public void draw() {
        color.bepaint("长方形");
    }
}
