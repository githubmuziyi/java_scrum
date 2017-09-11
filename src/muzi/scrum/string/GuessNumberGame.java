package muzi.scrum.string;

import java.util.Scanner;

/**
 * 猜数字小游戏的代码
 * Created by muzi on 2017/9/11.
 */
class GuessNumberGame {

    private  GuessNumberGame() {}

    public static void Game() {
        //产生一个随机数
        int number = (int) (Math.random() * 100) + 1;
        //键盘录入
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("请输入你要猜的数据（1-100）：");
            int guessNumber = sc.nextInt();
            //判断大小
            if (number > guessNumber) {
                System.out.println("你猜的数据小了");
            } else if (number < guessNumber) {
                System.out.println("你猜的数据大了");
            } else {
                System.out.println("恭喜你猜对了");
                break;
            }
        }
    }
}
