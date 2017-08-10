package pers.mq.demo.classloading;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-08-09
 * Time: 上午11:10
 */
public class NotInitialization {

    public static void main(String[] args) {
//        System.out.println(SubClass.value);
//        SuperClass[] sca = new SuperClass[10];
        System.out.println(ConstClass.HELLOWORLD);
    }
}
