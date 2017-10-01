package muzi.scrum.string;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Created by muzi on 2017/10/1.
 *
 * String(byte[] bytes, String charsetName) 通过指定的字符集解码字节数组
 * byte[] getBytes(String charsetName) 使用指定的字符集把字符串编码为字节数组
 * 注意：编码解码格式一致就不会出现乱码问题
 */
class CharsetDemo {

    public static void main(String[] args) {
        String s = "你好";
        try {
            //编码解码不一致导致乱码
            byte[] bytes = s.getBytes("UTF-8");
            System.out.println(Arrays.toString(bytes));
            String s2 = new String(bytes, "GBK");
            System.out.println(s2);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
