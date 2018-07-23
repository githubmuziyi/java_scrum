package muzi.scrum.thread;

/**
 * 线程池
 * @param <Job>
 */
public interface ThreadPool<Job extends Runnable> {

    /**
     * 执行一个job，这个job需要实现Runnable
     * @param job
     */
    void execute(Job job);

    /**
     * 关闭线程池
     */
    void shutDown();

    /**
     * 增加工作者线程
     * @param num
     */
    void addWorkers(int num);

    /**
     * 减少工作者线程
     * @param num
     */
    void removeWorkers(int num);

    /**
     * 得到正在等待执行的任务数量
     * @return
     */
    int getJobSize();
}
