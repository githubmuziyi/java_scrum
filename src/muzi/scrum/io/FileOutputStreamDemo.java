package muzi.scrum.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by muzi on 2017/9/29.
 * IO流的分类：
 *  1.输入流 读取数据
 *  2.输出流 输出数据
 *
 *  1.字节流
 *      字节输出流 InputStream
 *      字节输入流 OutputStream
 *          FileOutputStream类
 *              FileOutputStream(File file)
 *              FileOutputStream(String name)
 *
 *  2.字符流
 *      字符输出流 Reader
 *      字符输入流 Writer
 */
class FileOutputStreamDemo {

    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            //创建字节输出流对象
             fos = new FileOutputStream("./testdir/fos.md", true);
            //写入数据
            fos.write("Hello world" . getBytes());
            fos.write("\n".getBytes());
            fos.write(97);
            byte[] bytes = {97, 98, 99, 100, 101};
            fos.write(bytes, 1, 3);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //释放资源
            /**
             * 1.让流对象变成垃圾，这样就可以被垃圾回收器回收
             * 2.通知系统去释放该文件相关的资源
             */
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
