package pers.mq.demo.gof4.strategy;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-07
 * Time: 下午3:28
 */
public class Clinet {

    public static void main(String[] args) {
        int arr[] = {1, 4, 6, 2, 5, 3, 7, 10, 9};
        int result[];
        ArrayHandler ah = new ArrayHandler();
        Sort sort = new QuickSort();
        ah.setSortObj(sort);
        result = ah.sort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }
}
