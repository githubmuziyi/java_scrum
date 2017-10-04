package muzi.scrum.thread;

import java.util.concurrent.*;

/**
 * Created by muzi on 2017/10/4.
 * 线程池
 * 好处：
 *  1.线程池里每一个线程代码结束后，并不会死亡，而是再次回到线程池中变为空闲状态，等待下一个对象使用
 */
class ExecutorsDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建线程池对象，控制要创建几个线程
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        //可以执行Runnable对象或Callable对象代表的线程
        executorService.submit(new ThreadRunnable());
        executorService.submit(new ThreadRunnable());
        executorService.submit(new ThreadRunnable());
        //结束线程池
        executorService.shutdown();

        ExecutorService pool = Executors.newFixedThreadPool(3);
        //获取返回值
        Future<Integer> future = pool.submit(new MyCallable(5));
        Future<Integer> future1 = pool.submit(new MyCallable(10));
        Future<Integer> future2 = pool.submit(new MyCallable(100));
        //获取线程返回值
        Integer integer = future.get();
        Integer integer1 = future1.get();
        Integer integer2 = future2.get();
        System.out.println(integer);
        System.out.println(integer1);
        System.out.println(integer2);
        pool.shutdown();
    }
}

/**
 * 线程求和案例
 */
class MyCallable implements Callable<Integer> {

    private int number;

    public MyCallable(int number) {
        this.number = number;
    }

    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            //System.out.println(Thread.currentThread().getName() + ":" + i);
            sum += i;
        }
        return sum ;
    }
}
