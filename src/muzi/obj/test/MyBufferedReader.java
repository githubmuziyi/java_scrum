package muzi.obj.test;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by muzi on 2017/10/1.
 * 自定义readLine()
 */
class MyBufferedReader {

    private Reader reader;

    public MyBufferedReader(Reader reader) {
        this.reader = reader;
    }

    public String readLine() throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        int ch;
        while ((ch = reader.read()) != -1) {
            if (ch == '\r') {
                continue;
            }
            if (ch == '\n') {
                return stringBuilder.toString();
            } else {
                stringBuilder.append((char) ch);
            }
        }
        //如果缓冲有数据就需要返回
        if (stringBuilder.length() > 0) {
            return stringBuilder.toString();
        }
        return null;
    }

    public void close() throws IOException {
        this.reader.close();
    }
}

class MyBufferedReaderTest {

    public static void main(String[] args) throws IOException {
        MyBufferedReader myBufferedReader = new MyBufferedReader(new FileReader("./testdir/fos.md"));
        String s = null;
        while ((s = myBufferedReader.readLine()) != null) {
            System.out.println(s);
        }
        myBufferedReader.close();
    }
}
