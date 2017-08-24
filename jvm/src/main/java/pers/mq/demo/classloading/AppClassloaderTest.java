package pers.mq.demo.classloading;

/**
 * Created with IntelliJ IDEA.
 * Description: 应用加载器路径打印
 * User: mq
 * Date: 2017-08-23
 * Time: 上午10:27
 */
public class AppClassloaderTest {

    public static void main(String[] args) {
        System.out.println(System.getProperty("java.class.path"));
    }
}
