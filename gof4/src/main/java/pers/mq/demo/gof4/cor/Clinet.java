package pers.mq.demo.gof4.cor;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-08
 * Time: 下午2:13
 */
public class Clinet {

    public static void main(String[] args) {
        Leader objDirector, objManager, objGeneralManager, objViceGeneralManager;

        objDirector = new Director("王明");
        objManager = new Manager("赵强");
        objGeneralManager = new GeneralManager("李波");
        objViceGeneralManager = new ViceGeneralManager("肖红");

        objDirector.setSuccessor(objManager);
        objManager.setSuccessor(objViceGeneralManager);
        objViceGeneralManager.setSuccessor(objGeneralManager);

        LeaveRequest lr1 = new LeaveRequest("张三", 28);
        objDirector.handleRequest(lr1);
    }
}
