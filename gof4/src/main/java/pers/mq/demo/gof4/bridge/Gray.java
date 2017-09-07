package pers.mq.demo.gof4.bridge;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-07
 * Time: 下午2:07
 */
public class Gray implements Color {

    @Override
    public void bepaint(String shape) {
        System.out.println("灰色的" + shape);
    }
}
