package pers.mq.demo.gof4.iterator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-07
 * Time: 下午5:05
 */
public class Client {
    public static void display(Television tv) {
        TVIterator i = tv.createIterator();
        System.out.println("电视机频道：");
        while (!i.isLast()) {
            System.out.println(i.currentChannel().toString());
            i.next();
        }
    }

    public static void reverseDisplay(Television tv) {
        TVIterator i = tv.createIterator();
        i.setChannel(5);
        System.out.println("逆向遍历电视机频道：");
        while (!i.isFirst()) {
            i.previous();
            System.out.println(i.currentChannel().toString());
        }
    }

    public static void main(String a[]) {
        Television tv;
        tv = new SkyworthTelevision();
        display(tv);
        System.out.println("--------------------------");
        reverseDisplay(tv);
    }
}
