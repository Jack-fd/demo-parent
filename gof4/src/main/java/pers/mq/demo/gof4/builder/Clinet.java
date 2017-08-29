package pers.mq.demo.gof4.builder;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-08-29
 * Time: 下午5:56
 */
public class Clinet {

    public static void main(String[] args) {
        MealBuilder mealBuilderA = new MealBuilderA();
        KFCWaiter kfcWaiter = new KFCWaiter();
        kfcWaiter.setMealBuilder(mealBuilderA);
        Meal mealA = kfcWaiter.construct();
        System.out.println(mealA);

        MealBuilder mealBuilderB = new MealBuilderB();
        kfcWaiter.setMealBuilder(mealBuilderB);
        Meal mealB = kfcWaiter.construct();
        System.out.println(mealB);

    }
}
