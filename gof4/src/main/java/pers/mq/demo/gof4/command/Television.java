package pers.mq.demo.gof4.command;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-08
 * Time: 下午2:31
 */
public class Television {
    public void open() {
        System.out.println("打开电视机！");
    }

    public void close() {
        System.out.println("关闭电视机！");
    }

    public void changeChannel() {
        System.out.println("切换电视频道！");
    }
}
