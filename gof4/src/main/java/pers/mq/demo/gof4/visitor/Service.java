package pers.mq.demo.gof4.visitor;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-08
 * Time: 下午3:53
 */
public interface Service {

    void accept(Visitor visitor);
}
