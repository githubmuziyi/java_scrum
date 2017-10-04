package muzi.scrum.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by muzi on 2017/10/4.
 * Lock锁
 *
 * 方法：
 *  1.lock() 获取锁
 *  2.unlock() 释放锁
 */
class SellerTicketLock implements Runnable {

    private static int ticketNumber = 100;

    //定义锁对象
    private Lock lock = new ReentrantLock();

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        while (true) {
            //try finally 防止出问题不能释放锁
            try {
                //加锁
                lock.lock();
                if (ticketNumber > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + ticketNumber-- + "张票");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } finally {
                //释放锁
                lock.unlock();
            }
        }
    }
}
