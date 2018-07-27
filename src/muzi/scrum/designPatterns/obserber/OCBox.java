package muzi.scrum.designPatterns.obserber;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Observable;
import java.util.Observer;

public class OCBox extends Canvas implements Observer {

    Observable notifier;

    int x, y;

    Color cColor = newColor();

    static final Color[] colors = {
            Color.black,
            Color.blue,
            Color.cyan,
            Color.darkGray,
            Color.gray,
            Color.green,
            Color.lightGray,
            Color.magenta,
            Color.orange,
            Color.pink,
            Color.red,
            Color.white,
            Color.yellow
    };

    static final Color newColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    OCBox(int x, int y, Observable notifier) {
        this.x = x;
        this.y = y;
        notifier.addObserver(this);
        this.notifier = notifier;
        addMouseListener(new ML());
    }

    class ML extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent e) {
            notifier.notifyObservers(OCBox.this);
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        OCBox clicked = (OCBox) arg;
        if (nextTo(clicked)) {
            cColor = clicked.cColor;
            repaint();
        }
    }

    private final boolean nextTo(OCBox b) {
        return Math.abs(x - b.x) <= 1 && Math.abs(y - b.y) <= 1;
    }
}
