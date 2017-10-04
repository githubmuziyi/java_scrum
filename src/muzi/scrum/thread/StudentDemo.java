package muzi.scrum.thread;

/**
 * Created by muzi on 2017/10/4.
 * 生产者消费者问题：
 *  生产者：先看是否有数据，没有就生产，有就等待
 *  消费者：先看是够有数据，有就消费，没有就等待
 * 为了处理这样的问题，java提供了一种机制，等待唤醒机制
 *
 * 等待唤醒机制
 *  Object类中提供的方法
 *      wait()
 *          和sleep()的区别：
 *              sleep() 必须指定一个时间，调用不释放锁对象
 *              waiT() 可以指定时间也可以不指定时间，调用是释放锁
 *      notify()
 *      notifyAll()
 *  为什么这些方法不在Thread类中定义呢？
 *      这些方法的对象必须t通过锁对象调用，而所对象是任意对象，所以这些方法定义在Object类中
 */
class StudentDemo {

    public static void main(String[] args) {
        Student student = new Student();
        SetThread setThread = new SetThread(student);
        GetThread getThread = new GetThread(student);
        Thread thread1 = new Thread(setThread);
        Thread thread2 = new Thread(getThread);
        thread1.start();
        thread2.start();
    }
}

class Student {
    String name;
    int age;
    //默认情况下是没有数据
    boolean flag = false;
}

/**
 * 生产者
 */
class SetThread implements Runnable {
    private Student student;
    private int i = 0;

    public SetThread(Student student) {
        this.student = student;
    }

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        while (true) {
            synchronized (student) {
                //判断有没有
                if (student.flag) {
                    try {
                        student.wait(); //立即释放锁，将来醒过来的时候还是从这里醒过来
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (i % 2 == 0) {
                    student.name = "muzi";
                    student.age = 24;
                } else {
                    student.name = "wacai";
                    student.age = 30;
                }
                i++;
                //修改标记
                student.flag = true;
                //唤醒线程
                student.notify(); //唤醒不代表可以立即执行，必须还得抢cpu执行权
            }
        }
    }
}

/**
 * 消费者
 */
class GetThread implements Runnable {

    private Student student;

    public GetThread(Student student) {
        this.student = student;
    }
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        synchronized (student) {
            if (!student.flag) {
                try {
                    student.wait(); //立即释放锁
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(student.name + ":" + student.age);
            //修改标记
            student.flag = false;
            //唤醒线程
            student.notify();
        }
    }
}
