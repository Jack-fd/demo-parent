package pers.mq.demo.gof4.composite;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-07
 * Time: 下午2:35
 */
public class Client {

    public static void main(String[] args) {
        /**
         * 我们先建立一个这样的文件系统
         *                  总文件
         *
         *   a.txt    b.jpg                   c文件夹
         *                      c_1.text  c_1.rmvb    c_1.jpg
         *
         */
        //总文件夹
        Folder zwjj = new Folder("总文件夹");
        TextFile a = new TextFile("a.txt");
        ImageFile b = new ImageFile("b.jpg");
        Folder c = new Folder("c文件夹");
        TextFile c1 = new TextFile("c_1.txt");
        VideoFile c2 = new VideoFile("c_2.rmvb");
        VideoFile c3 = new VideoFile("c_3.jpg");
        c.add(c1);
        c.add(c2);
        c.add(c3);
        zwjj.add(a);
        zwjj.add(b);
        zwjj.add(c);
        zwjj.display();
    }
}
