package pers.mq.demo.gof4.singleton;

/**
 * Created with IntelliJ IDEA.
 * Description: 饿汉式单例模式
 * User: mq
 * Date: 2017-08-28
 * Time: 下午2:22
 */
public class SingletonDemo1 {

    private final static SingletonDemo1 instance = new SingletonDemo1();

    private SingletonDemo1() {

    }

    public static SingletonDemo1 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(SingletonDemo1.getInstance());
    }
}
