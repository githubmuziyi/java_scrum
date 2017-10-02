package muzi.scrum.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by muzi on 2017/10/2.
 * Properties:属性集合类，是一个可以和IO流结合使用的集合类
 * 可保存在流中或从流中加载，属性列表中每个键及其对应的值都是一个字符串
 *
 * 特殊方法：
 *  setProperty(String key, String value) 设置键值
 *  getProperty(String key) 根据键获取值
 *  stringPropertyNames()  获取所有键的集合
 *
 * 和IO流结合：
 *  load(Reader reader) 把文件中的数据读取到集合中
 *  store(Writer writer, String comments) 把集合中的数据保存到文件中
 */
class PropertiesDemo {

    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.put("muzi", "hello");
        properties.put("wacai", "baobao");
        System.out.println(properties);
        Set<Map.Entry<Object, Object>> set = properties.entrySet();
        for (Map.Entry<Object, Object> entry:
             set) {
            System.out.println(entry.getKey() + "-----" + entry.getValue());
        }
        System.out.println("---------------------");
        properties.setProperty("hello", "world");
        properties.setProperty("world", "hello");
        System.out.println(properties.get("world"));
        Set<String> set1 = properties.stringPropertyNames();
        for (String s:
             set1) {
            System.out.println(s + "-----" + properties.get(s));
        }

        /**
         * 和IO流结合使用
         * 加载
         * load  读取键值对数据  例如  muzi=30
         */
        Properties properties1 = new Properties();
        properties1.load(new FileReader("./testdir/prop"));
        System.out.println(properties1);

        /**
         * 保存
         * store
         */
        properties1.setProperty("liuzi", "22");
        properties1.setProperty("baozi", "33");
        properties1.store(new FileWriter("./testdir/prop"), "hahaha");
    }
}
