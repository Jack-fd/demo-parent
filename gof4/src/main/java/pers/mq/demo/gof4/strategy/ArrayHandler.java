package pers.mq.demo.gof4.strategy;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-07
 * Time: 下午3:28
 */
public class ArrayHandler {
    private Sort sortObj;

    public int[] sort(int arr[]) {
        return sortObj.sort(arr);
    }

    public void setSortObj(Sort sortObj) {
        this.sortObj = sortObj;
    }
}
