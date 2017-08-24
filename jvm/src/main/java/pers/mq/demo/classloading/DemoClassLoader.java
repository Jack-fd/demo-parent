package pers.mq.demo.classloading;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-08-23
 * Time: 上午10:54
 */
public class DemoClassLoader extends ClassLoader {

    @Override
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        return super.loadClass(name, resolve);
    }
}
