package muzi.scrum.io;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by muzi on 2017/10/2.
 * 随机访问流
 *  该类不属于流，是Object的子类，但它融合可InputStream和OutputStream的功能，支持对随机访问文件的读取和写入
 *  RandomAccessFile(String name, String mod)
 *      mod:
 *          r 只读
 *          rw 可读可写，不存在则创建
 */
class RandomAccessFileDemo {

    public static void main(String[] args) throws IOException {
        //write();
        read();
    }

    private static void read() throws IOException {
        RandomAccessFile raf = new RandomAccessFile("./testdir/raf.md", "rw");
        //int i = raf.readInt();
        //System.out.println(i);
        System.out.println("当前的文件指针是：" + raf.getFilePointer());
        //指定开始读取的指针
        raf.seek(4);
        boolean b = raf.readBoolean();
        System.out.println(b);
    }

    private static void write() throws IOException {
        RandomAccessFile raf = new RandomAccessFile("./testdir/raf.md", "rw");
        raf.writeInt(100);
        raf.writeBoolean(true);
        raf.writeUTF("中国");
        raf.close();
    }
}
