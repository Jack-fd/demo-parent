package pers.mq.demo.gof4.builder;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-08-29
 * Time: 下午5:51
 */
public class MealBuilderA extends MealBuilder {

    @Override
    public void buildFood() {
        this.meal.setFood("一个鸡腿堡");
    }

    @Override
    public void buildDrink() {
        this.meal.setDrink("一杯可乐");
    }
}
