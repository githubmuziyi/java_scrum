package muzi.scrum.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by muzi on 2017/10/1.
 * 字符流为了高效读写，也提供了对应的字符缓冲流
 */
class BufferedWriterDemo {

    public static void main(String[] args) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("./testdir/fos.md"));
            bufferedWriter.write("hello");
            bufferedWriter.write("你好呀");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
