package muzi.scrum.thread;

/**
 * Created by muzi on 2017/10/3.
 * 线程安全问题：
 *  1.相同票出现了多次
 *      cpu的一次操作必须是原子性的
 *  2.出现了负数票
 *      随机性和延迟导致的
 *
 * 如何解决线程安全问题：
 *  判断一个程序是否存在线程安全问题的标准
 *      1.是否是多线程环境
 *      2.是否存在共享数据
 *      3.是否有多条语句操作共享数据
 *  如何解决：
 *      思想：第一和第二条标准我们无法更改，只能从第三部入手，基本思想：把多条语句操作共享数据的操作包成一个整体，让某
 *      个线程执行时，其他线程无法操作
 *      java同步机制：
 *          synchronized(对象){需要同步的代码}
 *          同步的前提：
 *              多个线程
 *              多个线程使用同一个锁对象
 *          同步的好处：
 *              解决了多线的线程安全问题
 *          同步的弊端：
 *              锁判断，效率降低
 *              可能存在死锁问题
 *          同步方法的格式：
 *              synchronized 关键字加到方法上    synchronized private void seller()
 *              同步方法的锁对象：
 *                  this
 *          静态方法和锁对象：
 *              静态方法的锁对象是当前类的class文件对象
 *
 */
class SellTicketRunnable implements Runnable {

    private int ticketNumber = 100;

    //创建锁对象
    private Object object = new Object();
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
            seller();
        }
    }

    /**
     * 同步方法
     */
     private synchronized void seller() {
        if (ticketNumber > 0) {
            System.out.println(Thread.currentThread().getName() + "正在出售第" + ticketNumber-- + "张票");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
