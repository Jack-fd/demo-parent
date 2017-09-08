package pers.mq.demo.gof4.visitor;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-08
 * Time: 下午3:55
 */
public class Visitor {

    public void process(Service service) {
        System.out.println("基本业务");
    }

    public void process(Saving service) {
        System.out.println("存款");
    }

    public void process(Draw service) {
        System.out.println("提款");
    }

    public void process(Fund service) {
        System.out.println("基金");
    }
}
