package muzi.scrum.thread;

/**
 * 等待前驱线程中指
 *
 * @author muzi
 */
public class ThreadJoin {

    public static void main(String[] args) {

        Thread previous = Thread.currentThread();
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(new Domino(previous), String.valueOf(i));
            thread.start();
            previous = thread;
        }
    }

    static class Domino implements Runnable {

        private Thread thread;

        public Domino(Thread thread) {
            this.thread = thread;
        }

        @Override
        public void run() {
            try {
                // 等待前驱线程结束
                thread.join();
            } catch (InterruptedException e) {
            }
            System.out.println(Thread.currentThread().getName() + "terminate.");
        }
    }

}
