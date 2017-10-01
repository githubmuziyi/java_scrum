package muzi.scrum.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by muzi on 2017/10/1.
 * 简版字符转换流
 * FileWriter
 *
 * FileReader
 */
class FileWriteReadDemo {

    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("./testdir/fos.md");
            FileWriter fileWriter = new FileWriter("./testdir/fos1.md");
            char[] chars = new char[1024];
            int len;
            while ((len = fileReader.read(chars)) != -1) {
                fileWriter.write(chars, 0, len);
                fileWriter.flush();
            }
            fileReader.close();
            fileWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
