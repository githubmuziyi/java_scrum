package muzi.scrum.thread;

/**
 * Created by muzi on 2017/10/3.
 */
class SellTicket extends Thread {

    private static int ticketNumber = 100;
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
        //模拟一直在卖票
        while (true) {
            if (ticketNumber > 0) {
                System.out.println(getName() + "正在出售第" + ticketNumber-- + "张票");
            }
        }
    }
}
