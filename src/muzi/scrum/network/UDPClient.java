package muzi.scrum.network;

import java.io.IOException;
import java.net.*;

/**
 * Created by muzi on 2017/10/5.
 * UDP协议发送数据
 *  1.创建发送端Socket对象
 *  2.创建数据并把数据打包
 *  3.调用Socket对象的发送方法发送数据包
 *  4.释放资源
 */
class UDPClient {

    public static void main(String[] args) throws IOException {
        //创建Socket套接字
        DatagramSocket datagramSocket = new DatagramSocket();
        //创建数据包并把数据打包
        byte[] bytes = "hello, 欢迎" . getBytes();
        int len = bytes.length;
        InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
        int port = 10086;
        DatagramPacket datagramPacket = new DatagramPacket(bytes, len, inetAddress, port);
        //发送数据包
        datagramSocket.send(datagramPacket);
        //释放资源
        datagramSocket.close();
    }
}
