package pers.mq.demo.gof4.mediator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-08
 * Time: 下午4:19
 */
public class ColleagueA extends AbstractColleague {

    @Override
    public void setNumber(int number, AbstractColleague coll) {
        this.number = number;
        coll.setNumber(number * 100);
    }
}
