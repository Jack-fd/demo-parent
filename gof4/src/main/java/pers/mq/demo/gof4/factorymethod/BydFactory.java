package pers.mq.demo.gof4.factorymethod;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-08-29
 * Time: 下午2:45
 */
public class BydFactory implements CarFactory {

    @Override
    public Car create() {
        return new Byd();
    }
}
