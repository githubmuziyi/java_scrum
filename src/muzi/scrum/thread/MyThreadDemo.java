package muzi.scrum.thread;

/**
 * Created by muzi on 2017/10/3.
 * 多线程
 * Tread类:
 *  方式1.继承Thread类
 *      步骤：
 *          1.继承Thread类
 *          2.重写run方法
 *              不是类中的所有代码都需要多线程执行的，为了区分哪些代码能够被多线程执行，Thread类提供了run方法包含线程执行的代码
 *          3.创建对象
 *          4.启动线程
 *  方式2.实现Runnable接口
 *      步骤：
 *          1、类实现Runnable接口
 *          2.重写run方法
 *          3.创建类对象
 *          4.创建Thread的对象，并把第三部创建的对象当做构造参数传递
 *
 *  方式比较：
 *      方式2出现的原因
 *          1、可以避免java单继承带来的局限性
 *          2.适合多个相同程序处理同一资源的情况，把线程和程序代码分离，较好的体现了面向对象的设计思想
 *
 * 方法：
 *  获取线程优先级
 *      getPriority() 默认优先级是5
 *  获取当前正在执行的线程对象
 *      Thread.currentThread().getName()
 *  设置线程对象优先级
 *      setPriority(int i)
 *  线程休眠
 *      Thread.sleep(long millis)
 *  等待线程终止
 *      join()
 *  协程 暂停当前正在执行的线程，并执行其他线程，让多个线程的执行更和谐，但不能保证一人一次
 *      Thread.yield()
 *  守护线程
 *      setDaemon(boolean on)
 *      将该线程标记为守护线程或用户线程，当正在运行的线程都是守护线程是，java虚拟机退出，该方法必须在启动线程前调用
 *  中断线程
 *      1.stop() 不建议使用，已过时
 *      2.interrupt() 把线程状态终止，并抛出一个InterruptedException异常
 *
 * 注意：
 *  线程优先级高仅仅表示线程获取cpu时间片的几率高，依然存在随机性
 *
 * 面试题：
 *  线程的生命周期
 *      新建 创建线程对象
 *      就绪 该线程有执行资格，没有执行权
 *      运行 有执行资格和执行权
 *          阻塞 在运行过程中，由于一些操作让线程变为该状态，没有执行资格  没有执行权
 *      死亡 线程对象变成垃圾，等待回收
 */
class MyThreadDemo {

    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();
        //启动线程
        myThread1.setName("muzi");
        myThread2.setName("wacai");
        //设置守护线程
        myThread2.setDaemon(true);
        myThread3.setDaemon(true);
        myThread1.start();
        /*try {
            myThread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        myThread2.start();
        myThread3.start();
        //线程优先级
        System.out.println(myThread1.getPriority());
        //设置线程优先级  1-10
        myThread1.setPriority(Thread.MAX_PRIORITY);
        //获取当前正在执行的线程对象
        System.out.println(Thread.currentThread().getName());
        //主线程
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "---" + i);
        }

        //线程终止
        ThreadStop threadStop = new ThreadStop();
        threadStop.start();
        //超过3秒就终止
        try {
            Thread.sleep(3000);
            //threadStop.stop();//已经过时不建议使用
            threadStop.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
