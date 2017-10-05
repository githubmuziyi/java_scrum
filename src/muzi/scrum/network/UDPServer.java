package muzi.scrum.network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by muzi on 2017/10/5.
 * UDP协议接受数据
 *  1.创建接收端Socket对象
 *  2.创建一个数据包（接收容器）
 *  3.调用Socket对象的接收方法接收 数据包
 *  4.解析数据包,操作数据包
 *  4.释放资源
 */
class UDPServer {

    public static void main(String[] args) throws IOException {
        //创建socket对象
        DatagramSocket datagramSocket = new DatagramSocket(10086);
        //创建接收容器
        byte[] bytes = new byte[1024];
        int len = bytes.length;
        DatagramPacket datagramPacket = new DatagramPacket(bytes, len);
        //接收数据
        datagramSocket.receive(datagramPacket); //阻塞
        //解析数据包 操作数据
        InetAddress inetAddress = datagramPacket.getAddress();
        String ip = inetAddress.getHostAddress(); //获取ip
        byte[] bytes1 = datagramPacket.getData();
        int len1 = datagramPacket.getLength();
        String s = new String(bytes1, 0, len1);
        System.out.println(ip + ":" + s);
        //释放资源
        datagramSocket.close();
    }
}
