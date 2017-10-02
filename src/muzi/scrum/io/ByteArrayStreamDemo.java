package muzi.scrum.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by muzi on 2017/10/2.
 * 内存操作流：用于处理临时存储数据，程序结束，数据就从内存消失
 *
 * 字节数组：
 *  ByteArrayInputStream
 *  ByteArrayOutputStream
 * 字符数组：
 *  CharArrayReader
 *  CharArrayWriter
 * 字符串:
 *  StringReader
 *  StringWriter
 */
class ByteArrayStreamDemo {

    public static void main(String[] args) throws IOException {
        //写数据
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int x = 0; x < 10; x++) {
            byteArrayOutputStream.write(("hello" + x).getBytes());
        }
        byte[] bytes = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();//这是一个空方法，可以不用close

        //读数据
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        int by;
        while ((by = byteArrayInputStream.read()) != -1) {
            System.out.print((char) by);
        }
        byteArrayInputStream.close();
    }
}
