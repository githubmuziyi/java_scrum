package muzi.scrum.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by muzi on 2017/9/16.
 * 获取功能： 获取字符串中匹配规则的串
 */
class PatternDemo {

    public static void main(String[] args) {
        //模式和匹配器的典型调用顺序
        //将正则表达式编译成模式对象
        Pattern p = Pattern.compile("a*b");
        //通过模式对象获得匹配器对象，这个时候需要的是被匹配的字符
        Matcher m = p.matcher("aaaaaab");
        //调用匹配器对象的功能
        boolean b = m.matches();
        System.out.println(b);

        String s = "da jia ting wo shuo,jin tian yao xia yu";
        String regex = "\\b\\w{3}\\b";
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(s);
        boolean b1 = m1.find();
        System.out.println(b1);
        String s2 = m1.group();
        System.out.println(s2);
        /**
         * 注意：一定要先find之后才能group
         */
        while (m1.find()) {
            System.out.println(m1.group());
        }
    }
}
