package muzi.scrum.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by muzi on 2017/9/30.
 */
class BufferedInputStreamDemo {

    public static void main(String[] args) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("./testdir/fos.md"));
            int by;
            while ((by = bufferedInputStream.read()) != -1) {
                System.out.print((char) by);
            }
            bufferedInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
