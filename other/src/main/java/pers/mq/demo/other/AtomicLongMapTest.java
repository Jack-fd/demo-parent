package pers.mq.demo.other;

import com.google.common.util.concurrent.AtomicLongMap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-08-07
 * Time: 下午1:44
 */
public class AtomicLongMapTest {

    private static ConcurrentHashMap<String, Long> urlCounter = new ConcurrentHashMap<>();

    private static AtomicLongMap<String> urlCounter3 = AtomicLongMap.create();

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        int callTime = 100000;
        final String url = "http://localhost:8080/hello";
        CountDownLatch countDownLatch = new CountDownLatch(callTime);
        //模拟并发情况下的接口调用统计
        for (int i = 0; i < callTime; i++) {
            executor.execute(() -> {
//                increase1(url);
                increase2(url);
//                increase3(url);
                countDownLatch.countDown();
            });
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(urlCounter);
        executor.shutdown();
    }

    public static long increase1(String url) {
        if (urlCounter.get(url) == null) {
            urlCounter.put(url, 1L);
        } else {
            urlCounter.put(url, urlCounter.get(url) + 1);
        }
        return urlCounter.get(url);
    }

    public static Long getCount1(String url) {
        return urlCounter.get(url);
    }

    public static long increase2(String url) {
        while (true) {
            Long count = urlCounter.get(url);
            if (urlCounter.putIfAbsent(url, 1L) == null) {
                break;
            } else if (urlCounter.replace(url, count, count + 1)) {
                break;
            }
        }
        return urlCounter.get(url);
    }

    public static Long getCount2(String url) {
        return urlCounter.get(url);
    }

    public static long increase3(String url) {
        long newValue = urlCounter3.incrementAndGet(url);
        return newValue;
    }


    public static Long getCount3(String url) {
        return urlCounter3.get(url);
    }
}
