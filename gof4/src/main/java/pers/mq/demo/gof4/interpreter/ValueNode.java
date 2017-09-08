package pers.mq.demo.gof4.interpreter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-08
 * Time: 下午5:18
 */
public class ValueNode implements Node {
    private int value;

    public ValueNode(int value) {
        this.value = value;
    }

    public int interpret() {
        return this.value;
    }
}
