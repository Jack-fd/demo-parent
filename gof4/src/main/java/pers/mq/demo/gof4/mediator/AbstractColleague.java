package pers.mq.demo.gof4.mediator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-08
 * Time: 下午4:15
 */
public abstract class AbstractColleague {

    protected int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public abstract void setNumber(int number, AbstractColleague colleague);
}
