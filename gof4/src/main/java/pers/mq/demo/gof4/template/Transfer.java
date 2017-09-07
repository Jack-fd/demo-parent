package pers.mq.demo.gof4.template;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-07
 * Time: 下午4:02
 */
public class Transfer extends BankTemplateMethod {

    @Override
    public void transact() {
        System.out.println("转账");
    }
}
