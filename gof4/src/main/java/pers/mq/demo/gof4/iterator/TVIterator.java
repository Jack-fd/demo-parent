package pers.mq.demo.gof4.iterator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-07
 * Time: 下午4:58
 */
public interface TVIterator {

    void setChannel(int i);

    void next();

    void previous();

    boolean isLast();

    Object currentChannel();

    boolean isFirst();
}
