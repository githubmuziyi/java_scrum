package muzi.scrum.thread;

/**
 * Created by muzi on 2017/10/4.
 * 线程组：把多个线程组合到一起，可以对一批线程进行分类管理，java允许程序直接对线程组进行控制
 *
 * getThreadGroup()  获取线程组
 */
class ThreadGroupDemo {

    public static void main(String[] args) {
        ThreadRunnable threadRunnable = new ThreadRunnable();
        Thread thread1 = new Thread(threadRunnable, "muzi");
        Thread thread2 = new Thread(threadRunnable, "wacai");

        //获取线程组
        ThreadGroup threadGroup1 = thread1.getThreadGroup();
        ThreadGroup threadGroup2 = thread2.getThreadGroup();

        //获取线程组名称
        System.out.println(threadGroup1.getName());
        System.out.println(threadGroup2 .getName());

        //修改线程所在的组
        ThreadGroup threadGroup = new ThreadGroup("new group");
        Thread thread3 = new Thread(threadGroup, threadRunnable, "test");
        threadGroup.setDaemon(true);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
