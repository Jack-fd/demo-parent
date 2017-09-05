package pers.mq.demo.gof4.prototype.sample02;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-05
 * Time: 下午4:51
 */
public class Attachment implements Serializable {

    public void download() {
        System.out.println("下载附件");
    }
}
