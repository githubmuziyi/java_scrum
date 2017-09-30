package muzi.scrum.io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by muzi on 2017/9/30.
 * 缓冲区字节类
 *
 * 构造方法可以指定缓冲区大小，一般用不上，默认
 */
class BufferedOutputStreamDemo {

    public static void main(String[] args) {
        try {
            //FileOutputStream fileOutputStream = new FileOutputStream("./testdir/fos.md");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(
                    "./testdir/fos.md", true));
            bufferedOutputStream.write("muzi".getBytes());
            bufferedOutputStream.write("\n".getBytes());
            bufferedOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
