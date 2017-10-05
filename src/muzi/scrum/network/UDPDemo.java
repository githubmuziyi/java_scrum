package muzi.scrum.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

/**
 * Created by muzi on 2017/10/5.
 * 多线程聊天室案例
 */
class ChatRoom {
    public static void main(String[] args) throws SocketException {
        DatagramSocket client = new DatagramSocket();
        DatagramSocket receive = new DatagramSocket(10024);
        ClienThread clienThread = new ClienThread(client);
        ReceiveThread receiveThread = new ReceiveThread(receive);
        Thread thread1 = new Thread(clienThread);
        Thread thread2 = new Thread(receiveThread);
        thread1.start();
        thread2.start();
    }
}

class ClienThread implements Runnable{

    private DatagramSocket datagramSocket;

    public ClienThread(DatagramSocket datagramSocket) {
        this.datagramSocket = datagramSocket;
    }

    @Override
    public void run() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.equals("886")) {
                    break;
                }
                DatagramPacket datagramPacket = new DatagramPacket(
                        line.getBytes(), line.getBytes().length, InetAddress.getByName("127.0.0.1"), 10024);
                datagramSocket.send(datagramPacket);
            }
            datagramSocket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class ReceiveThread implements Runnable {

    private DatagramSocket datagramSocket;

    public ReceiveThread(DatagramSocket datagramSocket) {
        this.datagramSocket = datagramSocket;
    }

    @Override
    public void run() {
        try {
            while (true) {
                byte[] bytes = new byte[1024];
                DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
                datagramSocket.receive(datagramPacket);
                String ip = datagramPacket.getAddress().getHostAddress();
                String data = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
                System.out.println(ip + "::" + data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Receive {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(10024);
        while (true) {
            byte[] bytes = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
            datagramSocket.receive(datagramPacket);
            String ip = datagramPacket.getAddress().getHostAddress();
            String data = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
            System.out.println(ip + ":" + data);
        }
    }
}

class Client {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            if (line.equals("886")) {
                break;
            }
            DatagramPacket datagramPacket = new DatagramPacket(
                    line.getBytes(), line.getBytes().length, InetAddress.getByName("127.0.0.1"), 10024);
            datagramSocket.send(datagramPacket);
        }
        datagramSocket.close();
    }
}