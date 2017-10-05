package muzi.scrum.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by muzi on 2017/10/2.
 * 打印流
 * 字节打印流： PrintStream
 * 字符打印流: PrintWriter
 *
 * 打印流的特点：
 *  1.只有写数据的，没有读取数据的
 *  2.可以操作任意类型的数据
 *      print()
 *      println()
 *  3.如果启用了自动刷新，能够自动刷新
 *  4.该流可以直接操作文本文件
 *
 *  流：
 *      基本流：能够直接读写文件
 *      高级流：在基本流上提供了一些其他功能
 */
class PrintWriterDemo {

    public static void main(String[] args) throws IOException {
        //PrintWriter printWriter = new PrintWriter("./testdir/fos.md");
        PrintWriter printWriter = new PrintWriter(new FileWriter("./testdir/fos.md"), true);
        printWriter.write("hello");
        printWriter.write("world");
        printWriter.write("java");
        printWriter.print(true);
        printWriter.print(100);
        printWriter.println(true);
        printWriter.println(100);
        printWriter.println(12.35F);
        printWriter.close();
    }
}
