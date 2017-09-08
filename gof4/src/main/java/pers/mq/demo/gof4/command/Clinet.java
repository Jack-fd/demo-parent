package pers.mq.demo.gof4.command;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-08
 * Time: 下午2:37
 */
public class Clinet {

    public static void main(String[] args) {
        AbstractCommand openCommand, closeCommand, changeCommand;

        openCommand = new TVOpenCommand();
        closeCommand = new TVCloseCommand();
        changeCommand = new TVChangeCommand();

        Controller control = new Controller(openCommand, closeCommand, changeCommand);

        control.open();
        control.change();
        control.close();
    }
}
