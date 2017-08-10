package pers.mq.demo.classloading;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-08-09
 * Time: 上午11:09
 */
public class SubClass extends SuperClass {
    static {
        System.out.println("SubClass init!");
    }
}
