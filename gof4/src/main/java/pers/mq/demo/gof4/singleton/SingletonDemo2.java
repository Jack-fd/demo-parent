package pers.mq.demo.gof4.singleton;

/**
 * Created with IntelliJ IDEA.
 * Description: 懒汉式单例模式
 * User: mq
 * Date: 2017-08-28
 * Time: 下午2:22
 */
public class SingletonDemo2 {

    private static SingletonDemo2 instance;

    private SingletonDemo2() {

    }

    public static synchronized SingletonDemo2 getInstance() {
        if (instance == null) {
            instance = new SingletonDemo2();
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(SingletonDemo2.getInstance());
    }
}
