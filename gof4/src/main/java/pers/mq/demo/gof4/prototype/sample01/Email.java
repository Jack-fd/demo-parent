package pers.mq.demo.gof4.prototype.sample01;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-05
 * Time: 下午4:51
 */
public class Email implements Cloneable {

    private Attachment attachment;

    public Email() {
        this.attachment = new Attachment();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public  void display() {
        System.out.println("查看邮件");
    }
}
