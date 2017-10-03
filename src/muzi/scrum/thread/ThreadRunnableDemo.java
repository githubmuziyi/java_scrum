package muzi.scrum.thread;

/**
 * Created by muzi on 2017/10/3.
 */
class ThreadRunnableDemo {

    public static void main(String[] args) {
        ThreadRunnable threadRunnable = new ThreadRunnable();
        Thread thread = new Thread(threadRunnable, "muzi");
        Thread thread1 = new Thread(threadRunnable, "wacai");
        thread.start();
        thread1.start();
    }
}
