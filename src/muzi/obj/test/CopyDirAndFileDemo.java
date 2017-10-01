package muzi.obj.test;

import java.io.*;

/**
 * Created by muzi on 2017/10/1.
 * 复制多级文件夹及其文件
 *  封装数据源
 *  封装目的地
 *  递归复制文件
 *      是文件夹就创建
 *      是文件就复制文件
 */
class CopyDirAndFileDemo {

    public static void main(String[] args) {
        File srcFile = new File("./testdir");
        File descFile = new File("./testdircopy");
        try {
            if (!descFile.exists()) {
                descFile.mkdir();
            }
            copyFolder(srcFile, descFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 递归拷贝文件夹
     * @param srcFile
     * @param descFile
     * @throws IOException
     */
    private static void copyFolder(File srcFile, File descFile) throws IOException {
        if (srcFile.isDirectory()) {
            //文件夹
            File newFolder = new File(descFile, srcFile.getName());
            newFolder.mkdir();
            File[] files = srcFile.listFiles();
            for (File file:
                 files) {
                copyFolder(file, newFolder);
            }
        } else {
            //文件
            File newFile = new File(descFile, srcFile.getName());
            copyFile(srcFile, newFile);
        }
    }

    /**
     * 复制文件
     * @param srcFile 【源文件】
     * @param descFile 【目的文件】
     * @throws IOException 【异常】
     */
    private static void copyFile(File srcFile, File descFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(descFile));
        byte[] bytes = new byte[1024 * 2];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bis.close();
        bos.close();
    }
}
