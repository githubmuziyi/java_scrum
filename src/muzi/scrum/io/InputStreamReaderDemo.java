package muzi.scrum.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by muzi on 2017/10/1.
 * InputStreamReader(InputStream in, String charsetName) 按指定的编码方式读取字节
 */
class InputStreamReaderDemo {

    public static void main(String[] args) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("./testdir/fos.md"), "GBK");
            int ch = 0;
            while ((ch = inputStreamReader.read()) != -1) {
                System.out.print((char) ch);
            }
            inputStreamReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
