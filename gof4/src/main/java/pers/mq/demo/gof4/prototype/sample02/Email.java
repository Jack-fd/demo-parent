package pers.mq.demo.gof4.prototype.sample02;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-05
 * Time: 下午4:51
 */
public class Email implements Serializable  {

    private Attachment attachment;

    public Email() {
        this.attachment = new Attachment();
    }

    protected Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(this);

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream bis = new ObjectInputStream(bais);

        return bis.readObject();
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public void display() {
        System.out.println("查看邮件");
    }
}
