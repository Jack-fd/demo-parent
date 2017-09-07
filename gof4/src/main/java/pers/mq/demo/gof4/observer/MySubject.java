package pers.mq.demo.gof4.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-07
 * Time: 下午4:41
 */
public abstract class MySubject {

    protected List<MyObserver> observers = new ArrayList<>();

    public void attach(MyObserver observer) {
        observers.add(observer);
    }

    public void detach(MyObserver observer) {
        observers.remove(observer);
    }

    public abstract void cry();
}
