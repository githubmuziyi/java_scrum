package muzi.scrum.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

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
        try {
            FileOutputStream fos = new FileOutputStream("./testdir/fos.md");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
