package muzi.scrum.io;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by muzi on 2017/9/26.
 * 文件类File:
 *  构造方法：
 *      File(String pathname) 根据一个路径得到file对象
 *      File(String parent, String child) 根据一个目录和一个文件/目录得到一个file对象
 *      File(File parent, String child) 根据一个父File对象和一个文件/目录得到file对象
 *      创建文件或者文件夹没写路径，默认在项目路径下
 *
 * 方法：
 *  创建功能
 *      1.创建文件 createNewFile()
 *      2.创建文件夹 mkdir()
 *      3.创建多级文件夹 mkdirs()
 *  删除功能
 *      delete()
 *  重命名
 *      renameTo(File dest)
 *      如果路径名相同就是改名
 *      如果路径名不相同就是剪切
 *  判断功能
 *      isDirectory()
 *      isFile()
 *      exists()
 *      canRead()
 *      canWrite()
 *      isHidden()
 *  获取功能
 *      getAbsolutePath()
 *      getPath()
 *      getName()
 *      length()
 *      lastModified()
 *  高级获取功能
 *      String[] list() 获取指定路径下的所有文件或者文件夹的名称数组
 *      File[] listFiles() 获取指定目录下的所有文件或者文件夹的file数组
 *  文件名称过滤器
 *      String[] list(FilenameFilter filter)
 *      File[] listFiles(FilenameFilter filter)
 */
class FileDemo {

    public static void main(String[] args) {
        File file = new File("./testdir");
        System.out.println("mkdir:" + file.mkdir());
        File file1 = new File("./testdir/readme.md");
        File file5 = new File("./testdir/readme2.md");
        try {
            System.out.println("createNewFile:" + file1.createNewFile());
            System.out.println(file5.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        File file2 = new File("./testdir/firstdir/secenddir");
        System.out.println("mkdirs:" + file2.mkdirs());
        //System.out.println("delete:" + file1.delete());
        //System.out.println("delete:" + file2.delete());
        File file3 = new File("./testdir/readme.md");
        System.out.println("renameTo:" + file1.renameTo(file3));
        System.out.println("getAbsolutePath:" + file1.getAbsolutePath());
        System.out.println("getPath:" + file1.getPath());
        System.out.println("getName:" + file1.getName());
        System.out.println("length:" + file1.length());
        System.out.println("lastModified:" + file1.lastModified());
        Date date = new Date(file1.lastModified());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(date));
        String[] strings = file.list();
        for (String s:strings) {
            System.out.println(s);
        }
        System.out.println("-------------------------");
        File[] files = file.listFiles();
        for (File f:
             files) {
            System.out.println(f.getName());
        }
        System.out.println("-----------------------");
        String[] strings1 = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir, name).isFile() && name.endsWith(".md");
            }
        });
        for (String s1:
             strings1) {
            System.out.println(s1);
        }
    }
}
