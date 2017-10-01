package muzi.scrum.io;

import java.io.*;

/**
 * Created by muzi on 2017/10/1.
 * 字符缓冲流的特使方法：
 *  BufferedWriter
 *      newLine() 根据系统写换行符
 *  BufferedReader()
 *      readLine() 一次读取一行
 */
class BufferedDemo {

    public static void main(String[] args) {
        try {
            /**
             * 写数据
             */
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("./testdir/fos.md", true));
            bufferedWriter.write("我是菜鸟");
            bufferedWriter.newLine();
            bufferedWriter.flush();

            /**
             * 读数据
             */
            BufferedReader bufferedReader = new BufferedReader(new FileReader("./testdir/fos.md"));
            String s = null;
            while ((s = bufferedReader.readLine()) != null) {
                System.out.println(s);
            }
            bufferedWriter.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
