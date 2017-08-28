package pers.mq.demo.gof4.singleton;

/**
 * Created with IntelliJ IDEA.
 * Description: 枚举单例模式
 * User: mq
 * Date: 2017-08-28
 * Time: 下午2:22
 */
public enum SingletonDemo5 {

    INSTANCE;

    public String otherMethods(){
        return "Something";
    }

    public static void main(String[] args) {
        System.out.println(SingletonDemo5.INSTANCE.otherMethods());
    }
}
