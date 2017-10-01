package muzi.scrum.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by muzi on 2017/10/1.
 */
class BufferedReaderDemo {

    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("./testdir/fos.md"));
            char[] chars = new char[1024];
            int len;
            while ((len = bufferedReader.read(chars)) != -1) {
                System.out.print(new String(chars, 0, len));
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
