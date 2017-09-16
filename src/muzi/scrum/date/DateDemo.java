package muzi.scrum.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by muzi on 2017/9/16.
 * 构造方法
 * Date()
 * Date(Long date) //根据指定的毫秒值创建日期对象
 * 成员方法
 * getTime() 获取时间
 * setTime(long time) 设置时间
 */
class DateDemo {

    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        System.out.println(d);
        long time = System.currentTimeMillis();
        Date d2 = new Date(time);
        System.out.println(d2);

        Date d3 = new Date();
        long time1 = d3.getTime();
        System.out.println(time1);

        d3.setTime(1000);
        System.out.println(d3);

        //date  string 格式化和解析
        Date d4 = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat();
        String s1 = sdf.format(d);
        System.out.println(s1);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s2 = sdf2.format(d);
        System.out.println(s2);
        String str = "2001-12-03 16:23:14";
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d5 = sdf3.parse(str);
        System.out.println(d5);
        System.out.println(d5.getTime());

    }
}
