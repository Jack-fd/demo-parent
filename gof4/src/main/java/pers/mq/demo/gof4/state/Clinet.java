package pers.mq.demo.gof4.state;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-08
 * Time: 下午3:44
 */
public class Clinet {

    public static void main(String[] args) {
        WaterContext context = new WaterContext();

        for (int i = 0; i < 3; i++) {
            context.setIWaterState(i);
            context.getWaterState().printState();
        }
    }
}
