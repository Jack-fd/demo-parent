package pers.mq.demo.gof4.template;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-07
 * Time: 下午4:03
 */
public class Clinet {

    public static void main(String[] args) {
        BankTemplateMethod bankTemplateMethod = new Deposit();
        bankTemplateMethod.process();
    }
}
