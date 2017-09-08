package pers.mq.demo.gof4.state;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-08
 * Time: 下午3:38
 */
public class IceWaterState implements IWaterState {

    @Override
    public void printState() {
        System.out.println("Now state: Ice Water");
    }
}
