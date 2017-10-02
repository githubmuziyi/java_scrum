package muzi.scrum.io;

import java.io.*;

/**
 * Created by muzi on 2017/10/2.
 * 合并流
 * 合并多个文件
 */
class SequenceInputStreamDemo {

    public static void main(String[] args) throws IOException {
        SequenceInputStream sequenceInputStream = new SequenceInputStream(
                new FileInputStream("./testdir/fos.md"), new FileInputStream("./testdir/dos.md"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
                new FileOutputStream("./testdir/fold.md"));
        byte[] bytes = new byte[1024];
        int len;
        while((len = sequenceInputStream.read(bytes)) != -1) {
            bufferedOutputStream.write(bytes, 0, len);
        }
        sequenceInputStream.close();
        bufferedOutputStream.close();
    }
}
