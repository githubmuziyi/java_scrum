package muzi.scrum.timer;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * 测试类
 * @author muzi
 */
public class TimePrinterTest {

    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();
        Timer timer = new Timer(1000, listener);
        timer.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
