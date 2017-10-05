package muzi.scrum.network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

class TCPDemo {
}


/**
 * TCP协议发送数据
 * 1.创建Socket对象
 * 2.获取输出流
 * 3.释放资源
 */
class TCPClient {

    public static void main(String[] args) throws IOException {
        //创建Socket对象
        Socket socket = new Socket("127.0.0.1", 10024);
        //获取输出流，写数据
        /*OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello 你好".getBytes());*/
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            //结束标记
            if (line.equals("886")) {
               break;
            }
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        //接收反馈 socket终止功能
        socket.shutdownOutput();
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println("收到数据:" + new String(bytes, 0, len));
        //释放资源
        socket.close();
    }
}

/**
 * TCP协议接收数据
 * 1.创建接收端Socket对象
 * 2.监听客户端链接,返回一个对应的Socket对象
 * 3.获取输入流，读取数据，操作数据
 * 4.释放资源
 */
class TCPServer {

    public static void main(String[] args) throws IOException {
        //创建Socket对象
        ServerSocket serverSocket = new ServerSocket(10024);
        //监听数据
        Socket socket = serverSocket.accept(); //阻塞
        //获取输数据
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        //byte[] bytes = new byte[1024];
        //int len = inputStream.read(bytes);
        //获取客户端ip
        String ip = socket.getInetAddress().getHostAddress();
        //System.out.println(ip + ":" + new String(bytes, 0, len));
        String s = null;
        while ((s = bufferedReader.readLine()) != null) {
            System.out.println(s);
        }
        //反馈
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("数据收到".getBytes());
        //释放资源
        socket.close();
    }
}