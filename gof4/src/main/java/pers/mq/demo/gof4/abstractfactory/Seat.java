package pers.mq.demo.gof4.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-08-29
 * Time: 下午4:48
 */
public interface Seat {
    void message();
}

class LuxurySeat implements Seat {

    @Override
    public void message() {
        System.out.println("高级座椅");
    }
}

class LowSeat implements Seat {

    @Override
    public void message() {
        System.out.println("低级座椅");
    }
}