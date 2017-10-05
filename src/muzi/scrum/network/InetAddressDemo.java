package muzi.scrum.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by muzi on 2017/10/5.
 * InetAddress类：IP操作类
 *
 * 方法：
 *  getByName(String host) 根据主机名或者ip地址的字符串得到ip地址对象
 *  getHostName() 主机名
 *  getHostAddress() 主机ip地址
 */
class InetAddressDemo {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
        System.out.println(inetAddress.getHostName() + ":" + inetAddress.getHostAddress());
    }
}
