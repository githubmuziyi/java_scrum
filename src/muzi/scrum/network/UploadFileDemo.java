package muzi.scrum.network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by muzi on 2017/10/5.
 * 多线程多个客户端上传文件
 */
class UploadFileDemo {
}

class UserThread implements Runnable {

    private Socket socket;

    public UserThread(Socket socket) {
        this.socket =socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String fileName = System.currentTimeMillis() + ".md";
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
            //给出反馈
            BufferedWriter bufferedWriter1 = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bufferedWriter1.write("文件上传成功");
            bufferedWriter1.newLine();
            bufferedWriter1.flush();
            bufferedWriter.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/**
 * 服务端
 */
class UploadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10024);
        while (true) {
            Socket socket = serverSocket.accept();
            new Thread(new UserThread(socket)).start();
        }
    }
}

/**
 * 客户端
 */
class UploadClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10024);
        BufferedReader bufferedReader = new BufferedReader(new FileReader("./testdir/fos.md"));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        //管理写入流
        socket.shutdownOutput();
        //接收反馈
        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = bufferedReader1.readLine();
        System.out.println(s);
        bufferedReader.close();
        socket.close();
    }
}
