package muzi.scrum.io;

import java.io.File;

/**
 * Created by muzi on 2017/9/27.
 * 递归
 * 注意事项：
 *  1.递归一定要有出口，否则就是死递归
 *  2.递归的次数不能太多，否则会内存溢出
 *  3.构造方法不能递归使用
 */
class RecursionDemo {

    public static void main(String[] args) {
        System.out.println(recursion(5));
        System.out.println(resursion2(20));
        File file = new File("/usr/local/var/JavaProjects/java_scrum");
        getAllFile(file);
    }

    /**
     * 阶乘
     * @param n
     * @return
     */
    public static int recursion(int n) {
        if ( n == 1) {
            return 1;
        } else {
            return n*recursion(n - 1);
        }
    }

    /**
     * 斐波那契数列
     * 1,1,2,3,5,8,13,21,34,55,89...
     * @return
     */
    public static int resursion2(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return  resursion2(n - 1) + resursion2(n - 2);
        }
    }

    /**
     * 获取全部指定文件路径
     * @param srcFolder
     */
    public static void getAllFile(File srcFolder) {
        File[] files = srcFolder.listFiles();
        for (File file:
             files) {
            if (file.isDirectory()) {
                getAllFile(file);
            } else {
                if (file.getName().endsWith(".java")) {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }

    /**
     * 删除全部文件
     * @param srcFolder
     */
    public static void deleteFolder(File srcFolder) {
        File[] files = srcFolder.listFiles();
        for (File file:
             files) {
            if (file.isDirectory()) {
                deleteFolder(file);
            } else {
                System.out.println(file.getName() + "----" + file.delete());
            }
        }
        System.out.println(srcFolder.getName() + "----" + srcFolder.delete());
    }
}
