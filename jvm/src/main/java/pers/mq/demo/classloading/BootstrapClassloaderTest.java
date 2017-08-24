package pers.mq.demo.classloading;

import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * Description: BootstrapClassloader加载jar包打印
 * User: mq
 * Date: 2017-08-23
 * Time: 上午10:20
 */
public class BootstrapClassloaderTest {

    public static void main(String[] args) {
        URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
        for (int i = 0; i < urls.length; i++) {
            System.out.println(urls[i].toExternalForm());
        }
    }
}
