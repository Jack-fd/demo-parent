package pers.mq.demo.jvm;

/**
 * Created with IntelliJ IDEA.
 * Description: vm options:-Xss128k
 * User: mq
 * Date: 2017-08-01
 * Time: 上午10:27
 */
public class JavaVMStackSOF {
    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF javaVMStackSOF = new JavaVMStackSOF();
        javaVMStackSOF.stackLeak();
    }
}
