package muzi.obj.dao.impl;

import muzi.obj.dao.UserDao;
import muzi.obj.pojo.User;

import java.util.ArrayList;

/**
 * Created by muzi on 2017/9/20.
 * 用户操作的集体实现
 */
public class UserDaoImpl implements UserDao{

    private ArrayList<User> array = new ArrayList<>();

    @Override
    public boolean isLoging(String username, String password) {
        boolean result =false;
        /**
         * 遍历集合判断比较
         */
        for (User u : array) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                result = true;
                break;
            }
        }
        return result;
    }

    @Override
    public void regist(User user) {
        /**
         * 把用户信息存入集合
         */
        array.add(user);
    }
}
