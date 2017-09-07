package pers.mq.demo.gof4.bridge;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-07
 * Time: 下午2:17
 */
public class Clinet {

    public static void main(String[] args) {
        Color color = new White();
        Shape shape = new Square();
        shape.setColor(color);
        shape.draw();

        color = new Black();
        shape = new Rectangle();
        shape.setColor(color);
        shape.draw();
    }
}
