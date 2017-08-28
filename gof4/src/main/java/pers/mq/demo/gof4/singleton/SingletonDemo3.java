package pers.mq.demo.gof4.singleton;

/**
 * Created with IntelliJ IDEA.
 * Description: 双重检验锁单例模式
 * User: mq
 * Date: 2017-08-28
 * Time: 下午2:22
 */
public class SingletonDemo3 {

    private volatile static SingletonDemo3 instance;  //声明 volatile

    private SingletonDemo3() {

    }

    public static SingletonDemo3 getInstance() {
        if (instance == null) {
            synchronized (SingletonDemo3.class) {
                if (instance == null) {
                    instance = new SingletonDemo3();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(SingletonDemo3.getInstance());
    }
}
