package pers.mq.demo.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: vm options: -Xms20M -Xmx20M -XX:+HeapDumpOnOutOfMemoryError
 * User: mq
 * Date: 2017-08-01
 * Time: 上午9:35
 */
public class HeapOOM {

    static class OOMObject {
    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();
        while (true) {
            list.add(new OOMObject());
        }
    }
}
