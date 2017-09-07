package pers.mq.demo.gof4.flyweight;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-07
 * Time: 下午2:52
 */
public class Client {

    public static void main(String[] args) {
        Shape shape1 = FlyweightFactory.getShape("红色");
        Shape shape2 = FlyweightFactory.getShape("红色");
        shape1.draw();
        shape2.draw();
        System.out.println(shape1);
        System.out.println(shape2);
    }
}
