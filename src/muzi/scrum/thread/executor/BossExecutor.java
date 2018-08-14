package muzi.scrum.thread.executor;

import java.util.concurrent.*;

public class BossExecutor {

    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

    public static void addJob() {
        queue.add(1);
    }

    public static void doJob() {
        ExecutorService workExecutor = Executors.newFixedThreadPool(3);
        while (true) {
            try {
                if (queue.poll(60, TimeUnit.SECONDS) != null) {
                    workExecutor.execute(new Consumer());
                } else {
                    continue;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class Consumer implements Runnable {

        @Override
        public void run() {
            try {
                Thread.sleep(10 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hello world");
        }
    }

    public static void main(String[] args) {
        BossExecutor.addJob();
        BossExecutor.addJob();
        BossExecutor.addJob();
        BossExecutor.addJob();
        BossExecutor.doJob();
        System.out.println("return");
    }
}
