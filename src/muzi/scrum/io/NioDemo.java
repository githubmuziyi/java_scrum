package muzi.scrum.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by muzi on 2017/10/2.
 * NIO 提高了io的操作效率
 *
 * Path :与平台无关的路径
 * Paths :包含了返回Path的静态方法
 *  get(URI uri) 根据指定的uri来确定文件路径
 * Files ：操作文件的工具类
 *  copy(Path source, OutputStream out) 复制文件
 *  write(Path source, Iterable<? extends CharSequence> lines, Charset cs, OpenOption... options) 把集合数据写到文件
 */
class NioDemo {

    public static void main(String[] args) throws IOException {
        Files.copy(Paths.get("./testdir/fos.md"), new FileOutputStream("./testdir/niocopy.md"));
    }
}
