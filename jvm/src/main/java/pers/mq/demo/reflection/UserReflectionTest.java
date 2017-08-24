package pers.mq.demo.reflection;

import pers.mq.demo.reflection.bean.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-08-24
 * Time: 下午2:06
 */
public class UserReflectionTest {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        String className = "pers.mq.demo.reflection.bean.User";
        Class clazz = Class.forName(className);
        System.out.println("------class信息------");
        System.out.println(clazz);

        System.out.println("------属性信息------");
        Field[] fields = clazz.getFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i]);
        }

        System.out.println("------私有属性信息------");
        fields = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i]);
        }

        System.out.println("------方法信息------");
        Method[] methods = clazz.getMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i]);
        }

        System.out.println("------私有方法信息------");
        methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i]);
        }

        System.out.println("------构造方法信息------");
        Constructor[] constructors = clazz.getConstructors();
        for (int i = 0; i < constructors.length; i++) {
            System.out.println(constructors[i]);
        }

        System.out.println("------创建实例对象------");
        User user = (User) clazz.newInstance();
        user.setUserName("test1");
        System.out.println(user.getUserName());

        System.out.println("------使用有参数构造对象------");
        Constructor constructor = clazz.getDeclaredConstructor(Integer.class, Integer.class, String.class);
        user = (User) constructor.newInstance(1, 20, "test2");
        System.out.println(user.getUserName());

        System.out.println("------使用私有属性------");
        Field field = clazz.getDeclaredField("userName");
        field.setAccessible(true);
        field.set(user, "test3");
        System.out.println(user.getUserName());


    }
}
