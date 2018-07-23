package muzi.scrum.thread;

import java.util.Date;

/**
 * Created by muzi on 2017/10/3.
 */
class MyThread extends Thread {

    public MyThread() {}

    public MyThread(String name) {
        super(name);
    }

    /**
     * If this thread was constructed using a separate
     * <code>Runnable</code> run object, then that
     * <code>Runnable</code> object's <code>run</code> method is called;
     * otherwise, this method does nothing and returns.
     * <p>
     * Subclasses of <code>Thread</code> should override this method.
     *
     * @see #start()
     * @see #stop()
     */
    @Override
    public void run() {
        //super.run();
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "----" + i + new Date());
            //休眠一秒钟
            /*try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            //协程
            //Thread.yield();
        }
    }
}
