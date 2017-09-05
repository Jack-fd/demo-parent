package pers.mq.demo.gof4.prototype.sample02;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-05
 * Time: 下午4:55
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Email email, copyEmail;

        email = new Email();
        copyEmail = (Email) email.deepClone();

        System.out.println(email == copyEmail);
        System.out.println(email.getAttachment() == copyEmail.getAttachment());
    }
}
