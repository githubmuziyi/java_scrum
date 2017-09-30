package muzi.scrum.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by muzi on 2017/9/30.
 */
class FileInputStreamDemo {

    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("./testdir/fos.md");
            /**
             * 一次读取一个字节
             */
            /*int by = 0;
            while ((by = fis.read()) != -1) {
                System.out.print((char) by);
            }*/
            /**
             * 读取一个字节数组
             * 注意：带上len读取
             */
            byte[] bytes = new byte[1024]; //一次读取1k的数据
            int len = 0;
            while ((len = fis.read(bytes)) != -1) {
                System.out.print(new String(bytes, 0, len));
            }
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
