package muzi.scrum.thread;

/**
 * Created by muzi on 2017/10/4.
 *
 */
class DieLockDemo {

    public static void main(String[] args) {
        DieLock dieLock1 = new DieLock(true);
        DieLock dieLock2 = new DieLock(false);
        dieLock1.start();
        dieLock2.start();
    }
}
