package muzi.obj.dao;

import muzi.obj.pojo.User;

/**
 * Created by muzi on 2017/9/20.
 * 针对用户进行操作的接口
 */
public interface UserDao {

    /**
     * 用户登录功能
     * @param username 用户名
     * @param password 密码
     * @return 是否成功
     */
    public abstract boolean isLoging(String username, String password);

    /**
     * 用户注册
     * @param user 用户要注册的信息
     */
    public abstract void regist(User user);
}
