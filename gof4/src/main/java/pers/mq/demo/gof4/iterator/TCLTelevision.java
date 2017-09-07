package pers.mq.demo.gof4.iterator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-07
 * Time: 下午4:59
 */
public class TCLTelevision implements Television {

    private Object[] objects = {"湖南卫视", "北京卫视", "上海卫视", "湖北卫视", "黑龙江卫视"};

    @Override
    public TVIterator createIterator() {
        return new TCLIterator();
    }

    class TCLIterator implements TVIterator {
        private int currentIndex = 0;

        public void next() {
            if (currentIndex < objects.length) {
                currentIndex++;
            }
        }

        public void previous() {
            if (currentIndex > 0) {
                currentIndex--;
            }
        }

        public void setChannel(int i) {
            currentIndex = i;
        }


        public Object currentChannel() {
            return objects[currentIndex];
        }

        public boolean isLast() {
            return currentIndex == objects.length;
        }

        public boolean isFirst() {
            return currentIndex == 0;
        }
    }
}
