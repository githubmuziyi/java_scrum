package muzi.scrum.thread;

/**
 * Created by muzi on 2017/10/4.
 * 匿名内部类线程实例
 */
class StdClassThreadDemo {

    public static void main(String[] args) {
        //继承Thread类
        new Thread() {
            @Override
            public void run() {
                for (int x = 0; x < 100; x++) {
                    System.out.println(Thread.currentThread().getName() + ":" + x);
                }
            }
        }.start();

        //实现Runnable接口
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int x = 0; x < 100; x++) {
                    System.out.println(Thread.currentThread().getName() + ":" + x);
                }
            }
        }){}.start();


    }
}
