package pers.mq.demo.gof4.adapter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-06
 * Time: 下午4:24
 */
public class DogAdapter extends Dog implements Robot{

    @Override
    public void croy() {
        System.out.print("机器人模仿：");
        super.wang();
    }

    @Override
    public void move() {
        System.out.print("机器人模仿：");
        super.run();
    }
}
