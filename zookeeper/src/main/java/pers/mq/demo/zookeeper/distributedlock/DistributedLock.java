package pers.mq.demo.zookeeper.distributedlock;

import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA. Description: User: mq Date: 2017-07-21 Time: 下午3:43
 */
public interface DistributedLock {

    /**
     * 获取锁，如果没有得到就等待
     */
    void acquire() throws Exception;

    /**
     * 获取锁，直到超时
     *
     * @param unit time参数的单位
     * @return 是否获取到锁
     */
    boolean acquire(long time, TimeUnit unit) throws Exception;

    /**
     * 释放锁
     */
    void release() throws Exception;
}
