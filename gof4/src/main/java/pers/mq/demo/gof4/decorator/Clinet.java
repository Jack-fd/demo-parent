package pers.mq.demo.gof4.decorator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-06
 * Time: 下午5:24
 */
public class Clinet {

    public static void main(String[] args) {
        Transform transform = new Car();
        Robot robot = new Robot(transform);
        robot.move();
        robot.say();

        System.out.println("-------------");

        Airplane airplane = new Airplane(transform);
        airplane.move();
        airplane.fly();
    }
}
