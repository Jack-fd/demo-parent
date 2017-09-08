package pers.mq.demo.gof4.mediator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-08
 * Time: 下午4:21
 */
public class Clinet {

    public static void main(String[] args) {
        AbstractColleague collA = new ColleagueA();
        AbstractColleague collB = new ColleagueB();
        collA.setNumber(1000, collB);
        System.out.println("collA的number值："+collA.getNumber());
        System.out.println("collB的number值："+collB.getNumber());

        collB.setNumber(1000, collB);
        System.out.println("collA的number值："+collA.getNumber());
        System.out.println("collB的number值："+collB.getNumber());
    }

}
