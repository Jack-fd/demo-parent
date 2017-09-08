package pers.mq.demo.gof4.interpreter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-08
 * Time: 下午5:19
 */
public class Client {

    public static void main(String[] args) {
        String statement = "3 * 2 * 4 / 6 % 5";

        Calculator calculator = new Calculator();

        calculator.build(statement);

        int result = calculator.compute();

        System.out.println(statement + " = " + result);
    }
}
