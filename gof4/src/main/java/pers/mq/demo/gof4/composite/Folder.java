package pers.mq.demo.gof4.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-07
 * Time: 下午2:29
 */
public class Folder extends File {

    private List<File> files;

    public Folder(String name) {
        super(name);
        files = new ArrayList<>();
    }

    @Override
    public void display() {
        System.out.println("这是文件夹，文件夹名称:" + getName());
        for (int i = 0; i < files.size(); i++) {
            File file = files.get(i);
            file.display();
        }
    }

    public void add(File file) {
        files.add(file);
    }

    public void remove(File file) {
        files.remove(file);
    }
}
