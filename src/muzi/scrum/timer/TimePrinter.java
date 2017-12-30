package muzi.scrum.timer;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * 打印时间定时器
 * @author muzi
 */
public class TimePrinter implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        Date now = new Date();
        System.out.printf("At the tone,the time is:" + now);
        Toolkit.getDefaultToolkit().beep();
    }
}

