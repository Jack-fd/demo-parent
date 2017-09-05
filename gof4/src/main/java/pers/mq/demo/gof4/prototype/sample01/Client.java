package pers.mq.demo.gof4.prototype.sample01;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-05
 * Time: 下午4:55
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Email email, copyEmail;

        email = new Email();
        copyEmail = (Email) email.clone();

        System.out.println(email == copyEmail);
        System.out.println(email.getAttachment() == copyEmail.getAttachment());
    }
}
