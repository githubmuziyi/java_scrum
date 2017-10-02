package muzi.obj.dao.impl;

import muzi.obj.dao.UserDao;
import muzi.obj.pojo.User;

import java.io.*;

/**
 * Created by muzi on 2017/10/2.
 * 用户操作的具体实现（IO版）
 */
public class UserIODaoLmpl implements UserDao{

    private static File file = new File("./testdir/user.md");

    static {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 用户登录功能
     *
     * @param username 用户名
     * @param password 密码
     * @return 是否成功
     */
    @Override
    public boolean isLoging(String username, String password) {
        boolean flag = false;
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("./testdir/user.md"));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] datas = line.split("=");
                if (datas[0].equals(username) && datas[1].equals(password)) {
                    flag = true;
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return flag;
    }

    /**
     * 用户注册
     *
     * @param user 用户要注册的信息
     */
    @Override
    public void regist(User user) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("./testdir/user.md", true));
            bufferedWriter.write(user.getUsername() + "=" + user.getPassword());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
