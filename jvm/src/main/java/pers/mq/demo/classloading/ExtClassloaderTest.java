package pers.mq.demo.classloading;

/**
 * Created with IntelliJ IDEA.
 * Description: 扩展加载器目录打印
 * User: mq
 * Date: 2017-08-23
 * Time: 上午10:23
 */
public class ExtClassloaderTest {

    public static void main(String[] args) {
        System.out.println(System.getProperty("java.ext.dirs"));
    }
}
