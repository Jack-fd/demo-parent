package pers.mq.demo.gof4.simplefactory;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-08-29
 * Time: 下午2:45
 */
public class CarFactory {

    public static Car createCar(String type) {
        if ("奥迪".equals(type)) {
            return new Audi();
        } else if ("比亚迪".equals(type)) {
            return new Byd();
        }
        return null;
    }
}
