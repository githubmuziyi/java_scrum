package muzi.scrum.thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * 等待/通知机制
 *
 * @author muzi
 */
public class ThreadWaitNotify {

    static boolean flag = true;

    static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread waitThread = new Thread(new Wait(), "WaitThread");
        waitThread.start();
        TimeUnit.SECONDS.sleep(1);
        Thread notifyThread = new Thread(new Notify(), "NotofyThread");
        notifyThread.start();
    }

    /**
     * 消费者
     */
    static class Wait implements Runnable {

        @Override
        public void run() {
            // 获取锁
            synchronized (lock) {
                // 条件不满足
                while (flag) {
                    System.out.println(Thread.currentThread() + "flag is true. wait@ " +
                                new SimpleDateFormat("HH:mm:ss").format(new Date()));
                    // 释放锁，进入等待队列
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                    }
                }

                // 条件满足
                System.out.println(Thread.currentThread() + "flag is false. run@ " +
                            new SimpleDateFormat("HH:mm:ss").format(new Date()));
            }
        }
    }

    /**
     * 生产者
     */
    static class Notify implements Runnable {

        @Override
        public void run() {
            // 获取锁
            synchronized (lock) {
                System.out.println(Thread.currentThread() + "hold lock. notify@ " +
                            new SimpleDateFormat("HH:mm:ss").format(new Date()));
                lock.notifyAll();
                // 修改条件
                flag = false;
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
