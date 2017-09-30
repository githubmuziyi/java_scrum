package muzi.scrum.io;

import java.io.*;

/**
 * Created by muzi on 2017/10/1.
 */
class FileIoTest {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        //copyFile1("./testdir/fos.md", "./testdir/fos1.md");
        //copyFile2("./testdir/fos.md", "./testdir/fos2.md");
        copyFile3("./testdir/fos.md", "./testdir/fos3.md");
        //copyFile4("./testdir/fos.md", "./testdir/fos4.md");
        long end = System.currentTimeMillis();
        System.out.println("共耗时" + (end - start) + "毫秒");
    }

    public static void copyFile1(String srcString, String descString) {
        try {
            FileInputStream fileInputStream = new FileInputStream(srcString);
            FileOutputStream fileOutputStream = new FileOutputStream(descString);
            int by;
            while ((by = fileInputStream.read()) != -1) {
                fileOutputStream.write(by);
            }
            fileInputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFile2(String srcString, String descString) {
        try {
            FileInputStream fileInputStream = new FileInputStream(srcString);
            FileOutputStream fileOutputStream = new FileOutputStream(descString);
            byte[] bytes = new byte[1024];
            int len;
            while ((len = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, len);
            }
            fileInputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFile3(String srcString, String descString) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(srcString));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(descString));
            int by;
            while ((by = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(by);
            }
            bufferedInputStream.close();
            bufferedOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFile4(String srcString, String descString) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(srcString));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(descString));
            byte[] bytes = new byte[1024];
            int len;
            while ((len = bufferedInputStream.read(bytes)) != -1) {
                bufferedOutputStream.write(bytes, 0, len);
            }
            bufferedInputStream.close();
            bufferedOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
