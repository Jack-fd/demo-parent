package pers.mq.demo.gof4.command;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-08
 * Time: 下午2:36
 */
public class TVCloseCommand implements AbstractCommand {

    private Television television;

    public TVCloseCommand() {
        television = new Television();
    }

    @Override
    public void execute() {
        television.close();
    }
}
