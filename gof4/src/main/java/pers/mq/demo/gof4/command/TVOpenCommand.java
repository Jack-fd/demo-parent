package pers.mq.demo.gof4.command;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-08
 * Time: 下午2:33
 */
public class TVOpenCommand implements AbstractCommand {

    private Television television;

    public TVOpenCommand() {
        television = new Television();
    }

    @Override
    public void execute() {
        television.open();
    }
}
