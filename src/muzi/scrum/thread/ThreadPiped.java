package muzi.scrum.thread;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * 管道输入/输出流
 *
 * @author muzi
 */
public class ThreadPiped {

    public static void main(String[] args) throws IOException {

        PipedWriter out = new PipedWriter();
        PipedReader in = new PipedReader();
        // 链接输入输出流
        out.connect(in);
        Thread printThread = new Thread(new Print(in), "PrintThread");
        printThread.start();
        int receive = 0;
        try {
            while ((receive = System.in.read()) != -1) {
                out.write(receive);
            }
        } finally {
            out.close();
        }
    }

    /**
     * 打印线程
     */
    static class Print implements Runnable {

        private PipedReader in;

        public Print(PipedReader in) {
            this.in = in;
        }

        @Override
        public void run() {
            int receive = 0;
            try {
                while ((receive = in.read()) != -1) {
                    System.out.println((char) receive);
                }
            } catch (IOException ex) {
            }

        }
    }

}
