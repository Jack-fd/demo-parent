package pers.mq.demo.gof4.state;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-08
 * Time: 下午3:39
 */
public class WarmWaterState implements IWaterState {

    @Override
    public void printState() {
        System.out.println("Now state: Warm Water");
    }
}
