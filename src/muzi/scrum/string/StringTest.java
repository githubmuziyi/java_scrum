package muzi.scrum.string;

import java.util.Scanner;

/**
 * Created by muzi on 2017/9/11.
 */
class StringTest {

    public static void main(String[] args) {
        String username = "admin";
        String password = "admin";
        //键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入用户名:");
            String name = sc.nextLine();
            System.out.println("请输入密码:");
            String pwd = sc.nextLine();
            //校验密码
            if (name.equals(username) && pwd.equals(password)) {
                System.out.println("登入成功");
                GuessNumberGame.Game();
                break;
            } else {
                if (0 == ( 2 - i)) {
                    System.out.println("账号被锁定，请联系班长");
                    break;
                }
                System.out.println("登录失败，你还有" + ( 2 - i ) + "次机会");
            }
        }
    }
}
