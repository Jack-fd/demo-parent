package pers.mq.demo.gof4.interpreter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-08
 * Time: 下午5:17
 */
public class ModNode extends SymbolNode {

    public ModNode(Node left,Node right)
    {
        super(left,right);
    }

    public int interpret()
    {
        return super.left.interpret() % super.right.interpret();
    }
}
