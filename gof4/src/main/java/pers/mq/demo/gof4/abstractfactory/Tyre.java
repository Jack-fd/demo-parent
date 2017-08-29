package pers.mq.demo.gof4.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-08-29
 * Time: 下午4:50
 */
public interface Tyre {

    void revolve();
}

class LuxuryTyre implements Tyre {

    @Override
    public void revolve() {
        System.out.println("高端轮胎");
    }
}

class LowTyre implements Tyre {

    @Override
    public void revolve() {
        System.out.println("低端轮胎");
    }
}
