package pers.mq.demo.gof4.mediator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-08
 * Time: 下午4:21
 */
public class ColleagueB extends AbstractColleague {

    @Override
    public void setNumber(int number, AbstractColleague colleague) {
        this.number = number;
        colleague.setNumber(number / 100);
    }
}
