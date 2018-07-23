package muzi.scrum.thread;

import java.util.concurrent.TimeUnit;

/**
 * 安全而优雅的关闭线程
 *
 * @author muzi
 */
public class ThreadShutDown {

    public static void main(String[] args) throws InterruptedException {

        /**
         * 使用中断结束线程
         */
        Runner one = new Runner();
        Thread countThread = new Thread(one, "CountThread");
        countThread.start();
        // 睡眠1s
        TimeUnit.SECONDS.sleep(1);
        // 使用中断结束CountThread线程
        countThread.interrupt();

        /**
         * 使用标志位中断线程
         */
        Runner two = new Runner();
        countThread = new Thread(two, "CountThread");
        countThread.start();
        // 睡眠一秒
        TimeUnit.SECONDS.sleep(1);
        // 改变标志位让线程结束
        two.cancel();

    }

    private static class Runner implements Runnable {

        private long i;
        private volatile boolean on = true;

        @Override
        public void run() {
            while (on && !Thread.currentThread().isInterrupted()) {
                i++;
            }
            System.out.println("Count i = " + i);
        }

        void cancel() {
            on = false;
        }
    }

}
