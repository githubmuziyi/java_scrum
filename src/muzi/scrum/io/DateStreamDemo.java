package muzi.scrum.io;

import java.io.*;

/**
 * Created by muzi on 2017/10/2.
 * 可以读写java基本数据类型的数据
 * 数据输入流
 *  DataInputStream(InputStream in)
 * 数据输出流
 *  DataOutputStream(OutputStream out)
 */
class DateStreamDemo {

    public static void main(String[] args) throws IOException {
        //write();
        read();
    }

    private static void read() throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("./testdir/dos.md"));
        byte b = dis.readByte();
        short s = dis.readShort();
        dis.close();
        System.out.println(b);
        System.out.println(s);
    }

    private static void write() throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("./testdir/dos.md"));
        dos.writeByte(10);
        dos.writeShort(100);
        dos.writeInt(1000);
        dos.writeLong(10000);
        dos.writeFloat(12.34F);
        dos.writeDouble(12.56);
        dos.writeChar('a');
        dos.writeBoolean(true);
        dos.close();
    }



}
