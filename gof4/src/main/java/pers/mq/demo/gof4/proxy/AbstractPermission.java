package pers.mq.demo.gof4.proxy;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-06
 * Time: 下午5:36
 */
public interface AbstractPermission {

    void modifyUserInfo();

    void viewNote();

    void publishNote();

    void modifyNote();

    void setLevel(int level);
}
