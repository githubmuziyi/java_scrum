package muzi.obj.test;

import muzi.obj.dao.UserDao;
import muzi.obj.dao.impl.UserDaoImpl;
import muzi.obj.pojo.User;

import java.util.Scanner;

/**
 * Created by muzi on 2017/9/20.
 * 测试类
 */
class UserTest {

    public static void main(String[] args) {
        UserDao ud = new UserDaoImpl();
        while (true) {
            Scanner sc = new Scanner(System.in);
            String choiceString = sc.nextLine();
            switch (choiceString) {
                case "1":
                    System.out.println("登录:");
                    System.out.println("请输入用户名：");
                    String userNameNew = sc.nextLine();
                    System.out.println("请输入密码：");
                    String passWordNew = sc.nextLine();

                    //登录
                    boolean res = ud.isLoging(userNameNew, passWordNew);
                    if (res) {
                        System.out.println("Login success");
                        System.exit(0);
                    } else {
                        System.out.println("Login fail");
                    }
                    break;
                case "2":
                    System.out.println("注册:");
                    System.out.println("请输入用户名：");
                    String userName = sc.nextLine();
                    System.out.println("请输入密码：");
                    String passWord = sc.nextLine();

                    User user = new User();
                    user.setUsername(userName);
                    user.setPassword(passWord);

                    //注册
                    ud.regist(user);
                    System.out.println("注册成功");
                    break;
                case "3":
                    System.out.println("Logout thx");
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
