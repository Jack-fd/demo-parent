package pers.mq.demo.other;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-08-14
 * Time: 下午7:03
 */

interface Interface1 {
    void m();
}

interface Interface2 {
    default void m() {
        System.out.println("default function");
    }
}

public class DefaultInterface implements Interface1, Interface2 {

    public static void main(String[] args) {
       new DefaultInterface().m();
    }

    @Override
    public void m() {
        Interface2.super.m();
    }
}
