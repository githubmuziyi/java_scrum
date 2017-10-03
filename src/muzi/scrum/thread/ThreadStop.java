package muzi.scrum.thread;

/**
 * Created by muzi on 2017/10/3.
 */
class ThreadStop extends Thread {

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
     * @see #Thread(ThreadGroup, Runnable, String)
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("线程开始");
            //休息10s
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("线程被中断");
            }
            System.out.println("线程结束");
        }
    }
}
