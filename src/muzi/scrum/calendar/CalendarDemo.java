package muzi.scrum.calendar;

import java.util.Calendar;

/**
 * Created by muzi on 2017/9/16.
 */
class CalendarDemo {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        //获取年
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int date = c.get(Calendar.DATE);
        System.out.println(String.valueOf(year) + month + date);

        c.add(Calendar.YEAR, +3);//加三年
        String year2 = String.valueOf(c.get(Calendar.YEAR));
        System.out.println(String.valueOf(year2) + month + date);

        c.set(2015, 11, 10);//设置为2015年12月20号 （月是从0开始）
    }
}
