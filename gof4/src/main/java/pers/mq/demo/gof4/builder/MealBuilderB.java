package pers.mq.demo.gof4.builder;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-08-29
 * Time: 下午5:51
 */
public class MealBuilderB extends MealBuilder {

    @Override
    public void buildFood() {
        this.meal.setFood("一个鸡肉卷");
    }

    @Override
    public void buildDrink() {
        this.meal.setDrink("一杯果汁");
    }
}
