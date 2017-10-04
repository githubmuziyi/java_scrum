package muzi.scrum.thread;

import java.io.IOException;

/**
 * Created by muzi on 2017/10/4.
 * exec(String cmd) 执行一条系统命令
 * 用到的是单例模式
 */
class RuntimeDemo {

    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        runtime.exec("ls -a");
    }
}
