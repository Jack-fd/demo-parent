package pers.mq.demo.gof4.adapter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-06
 * Time: 下午4:25
 */
public class Clinet {

    public static void main(String[] args) {
        Robot robot = new BirdAdapter();
        robot.croy();
        robot.move();
    }
}
