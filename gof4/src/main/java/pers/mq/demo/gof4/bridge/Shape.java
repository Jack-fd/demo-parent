package pers.mq.demo.gof4.bridge;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-07
 * Time: 下午2:08
 */
public abstract class Shape {

    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
