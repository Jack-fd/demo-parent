package pers.mq.demo.zookeeper.distributedlock;

import org.I0Itec.zkclient.ZkClient;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import lombok.extern.slf4j.Slf4j;

/**
 * Created with IntelliJ IDEA. Description: User: mq Date: 2017-07-21 Time: 下午4:13
 */
@Slf4j
public class DistributedLockTest {


    @Test
    public void test() throws Exception {
        client1();
        client2();
        client3();
    }

    private void client1() throws Exception {
        ZkClient zkClient = new ZkClient("172.16.3.55:2181");
        DistributedLock dl = new SimpleDistributedLockMutex(zkClient, "/locker");
        dl.acquire();
        log.info("开始处理中任务1.....");
        TimeUnit.SECONDS.sleep(20);
        dl.release();
    }

    private void client2() throws Exception {
        ZkClient zkClient = new ZkClient("172.16.3.55:2181");
        DistributedLock dl = new SimpleDistributedLockMutex(zkClient, "/locker");
        dl.acquire();
        log.info("开始处理中任务2.....");
        TimeUnit.SECONDS.sleep(20);
        dl.release();
    }

    private void client3() throws Exception {
        ZkClient zkClient = new ZkClient("172.16.3.55:2181");
        DistributedLock dl = new SimpleDistributedLockMutex(zkClient, "/locker");
        dl.acquire();
        log.info("开始处理中任务3.....");
        TimeUnit.SECONDS.sleep(20);
        dl.release();
    }

}