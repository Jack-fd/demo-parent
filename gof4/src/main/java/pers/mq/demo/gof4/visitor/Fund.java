package pers.mq.demo.gof4.visitor;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-08
 * Time: 下午3:57
 */
public class Fund implements Service {

    @Override
    public void accept(Visitor visitor) {
        visitor.process(this);
    }
}
