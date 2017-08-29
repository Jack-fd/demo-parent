package pers.mq.demo.gof4.factorymethod;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-08-29
 * Time: 下午2:53
 */
public class BeanzFactory implements CarFactory {

    @Override
    public Car create() {
        return new Beanz();
    }
}
