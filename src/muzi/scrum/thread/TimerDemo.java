package muzi.scrum.thread;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by muzi on 2017/10/4.
 * 定时器：可以让我们在指定的时间做某件事情，还可以重复的做某件事
 * 依赖Timer和TimerTask类：
 *  Timer:定时
 *      Timer()
 *      schedule(TimerTask task, long delay)
 *      schedule(TimerTask task, long delay, long period)
 *  TimerTask:任务
 */
class TimerDemo {

    public static void main(String[] args) {
        //创建定时器对象
        Timer timer = new Timer();
        timer.schedule(new MyTask(timer), 3000);
        //重复
        timer.schedule(new MyTask2(), 3000, 2000);
    }
}


/**
 * 任务
 */
class MyTask extends TimerTask {

    private Timer timer;

    public MyTask(Timer timer) {
        this.timer = timer;
    }

    /**
     * The action to be performed by this timer task.
     */
    @Override
    public void run() {
        System.out.println("BongBongBong");
        //结束任务
        //timer.cancel();
    }
}

class MyTask2 extends TimerTask {

    /**
     * The action to be performed by this timer task.
     */
    @Override
    public void run() {
        System.out.println("BongBong");
    }
}
