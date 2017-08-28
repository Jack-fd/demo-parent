package pers.mq.demo.gof4.singleton;

/**
 * Created with IntelliJ IDEA.
 * Description: 静态内部类单例模式
 * User: mq
 * Date: 2017-08-28
 * Time: 下午2:22
 */
public class SingletonDemo4 {

    private static class SingletonHolder {
        private static final SingletonDemo4 instance = new SingletonDemo4();
    }

    private SingletonDemo4() {

    }

    public static SingletonDemo4 getInstance() {

        return SingletonHolder.instance;
    }

    public static void main(String[] args) {
        System.out.println(SingletonDemo4.getInstance());
    }
}
