package pers.mq.demo.gof4.state;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-08
 * Time: 下午3:40
 */
public class WaterContext {

    private IWaterState waterState;

    public IWaterState getWaterState() {
        return waterState;
    }

    public void setIWaterState(int i) {
        if (i == 0) {
            waterState = new IceWaterState();
            return;
        }

        if (i == 1) {
            waterState = new WarmWaterState();
            return;
        }

        if (i == 2) {
            waterState = new BoilingWaterState();
            return;
        }
    }

}
