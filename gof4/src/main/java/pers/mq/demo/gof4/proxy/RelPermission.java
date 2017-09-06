package pers.mq.demo.gof4.proxy;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-06
 * Time: 下午5:38
 */
public class RelPermission implements  AbstractPermission{

    @Override
    public void modifyUserInfo() {
        System.out.println("修改用户信息");
    }

    @Override
    public void viewNote() {

    }

    @Override
    public void publishNote() {
        System.out.println("发布新贴！");
    }

    @Override
    public void modifyNote() {
        System.out.println("修改发帖内容");
    }

    @Override
    public void setLevel(int level) {

    }
}
