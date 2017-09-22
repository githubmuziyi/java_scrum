package muzi.scrum.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by muzi on 2017/9/22.
 * Map集合的特点：
 *  将键映射到值的对象，一个映射不能包好重复的键，每个键最多只能映射到一个值
 * Map集合的功能：
 *  1.添加
 *      V put(K key, V value) 添加一个元素
 *          如果键是第一次存储，就直接存储，返回null
 *          如果键不是第一次存在，就用值替换第一次的值，返回被替换的值
 *  2.删除
 *      clear() 移除谁有的键值对元素
 *      V remove(Object key) 根据键删除键值对元素，并返回删除的值
 *  3.判断
 *      containsKey(Object key) 判断集合是否包含指定的键
 *      containsValue(Object value) 判断集合是否包含指定的值
 *  4.获取
 *      V get(Object key) 根据键获取值
 *      Set<K> keySet() 获取集合中所有键的集合
 *      Collection<V> values() 获取集合中所有值得集合
 *      Set<Map.Entry<K, V>> entrySet() 获取键值对对象
 *  5.长度
 *      int size() 返回集合键值对的个数
 */
class MapDemo {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        String s = map.put("muzi", "hello");
        map.put("hewei", "java");
        map.put("cunzhang", "python");
        System.out.println(s);
        System.out.println(map.put("muzi", "world"));
        //map.clear();
        System.out.println(map.remove("muzi"));
        System.out.println(map.containsKey("hewei"));
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map);

        //获取功能
        System.out.println(map.get("hewei"));
        Set<String> set = map.keySet();
        for (String s1:
             set) {
            System.out.println(s1);
        }
        Collection<String> collection = map.values();
        for (String s2:
             collection) {
            System.out.println(s2);
        }

        //map的遍历
        Set<Map.Entry<String, String>> set2 = map.entrySet();
        for (Map.Entry<String, String> me:
             set2) {
            System.out.println(me.getKey() + "----" + me.getValue());
        }

        Set<String> set4 = map.keySet();
        for (String s3:
             set4) {
            System.out.println(s3 + "-----" + map.get(s3));
        }
    }
}
