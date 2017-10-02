package muzi.scrum.io;

import java.io.*;

/**
 * Created by muzi on 2017/10/2.
 * 标准输入输出流
 *
 * 标准输入流：public static final InputStream in
 * 标准输出流：public static final PrintStream out
 */
class SystemInDemo {

    public static void main(String[] args) throws IOException {
        //获取标准输出流对象
        PrintStream ps = System.out;
        ps.println("hello");

        /**
         * 通过字符缓冲流包装标准输入流实现键盘录入数据实现Scanner的类似功能
         */
        //获取标准输入流
        InputStream is = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(inputStreamReader);
        System.out.println("请输入一个字符串：");
        String s = br.readLine();
        System.out.println("输入的字符是:" + s);

        /**
         * 字符转换流包装标注输出流，字符缓冲流包装字符转换流，实现控制台打印数据
         */
        OutputStream os = System.out;
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(os);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        bufferedWriter.write("hello");
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
