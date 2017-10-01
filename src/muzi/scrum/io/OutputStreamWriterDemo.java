package muzi.scrum.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Created by muzi on 2017/10/1.
 * OutputStreamWriter(OutputStream out) 默认字符编码
 * OutputStreamWriter(OutputStream out，String charsetName) 根据指定编码把字节流转换为字符流
 * 把字节流转换为字符流
 * 字符流 = 字节流 + 编码表
 */
class OutputStreamWriterDemo {

    public static void main(String[] args) {
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(
                    new FileOutputStream("./testdir/fos.md", true), "UTF-8");
            outputStreamWriter.write("中国");
            outputStreamWriter.write("\r\n");
            outputStreamWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
