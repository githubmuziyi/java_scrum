package muzi.scrum.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/**
 * Created by muzi on 2017/10/1.
 * LinuNumberReader
 * 1. getLineNumber() 获取当前行号
 * 2. setLineNumber(int LineNumber) 设置行号
 */
class LineNumberReaderDemo {

    public static void main(String[] args) {
        LineNumberReader lineNumberReader = null;
        try {
            lineNumberReader = new LineNumberReader(new FileReader("./testdir/fos.md"));
            lineNumberReader.setLineNumber(10);
            String line = null;
            while ((line = lineNumberReader.readLine()) != null) {
                System.out.println(lineNumberReader.getLineNumber() + "." + line);
            }
            lineNumberReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
