package pers.mq.demo.gof4.proxy;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-06
 * Time: 下午5:41
 */
public class Clinet {

    public static void main(String[] args) {
        AbstractPermission permission = new PermissionProxy();
        permission.viewNote();
        permission.publishNote();
        permission.modifyNote();
        permission.modifyUserInfo();
        System.out.println("---------------");

        permission.setLevel(1);
        permission.viewNote();
        permission.publishNote();
        permission.modifyNote();
        permission.modifyUserInfo();
    }
}
