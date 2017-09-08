package pers.mq.demo.gof4.command;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-08
 * Time: 下午2:31
 */
public class TVChangeCommand implements AbstractCommand {

    private Television television;

    public TVChangeCommand() {
        television = new Television();
    }

    @Override
    public void execute() {
        television.changeChannel();
    }
}
