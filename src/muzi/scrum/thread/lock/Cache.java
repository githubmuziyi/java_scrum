package muzi.scrum.thread.lock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 读写锁
 * @author muzi
 */
public class Cache {

    static Map<String, Object> map = new HashMap<>();

    static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    static Lock r = readWriteLock.readLock();

    static Lock w = readWriteLock.writeLock();

    boolean update = true;

    /**
     * 获取key对应的value
     */
    public static Object get(String key) {
        r.lock();
        try {
            return map.get(key);
        } finally {
            r.unlock();
        }
    }

    /**
     * 设置key对应的value，并返回旧值
     */
    public static Object put(String key, Object value) {
        w.lock();
        try {
            return map.put(key, value);
        } finally {
            w.unlock();
        }
    }

    /**
     * 清空所有内容
     */
    public static void clear() {
        w.lock();
        try {
            map.clear();
        } finally {
            w.unlock();
        }
    }

    /**
     * 锁降级
     */
    public void processData() {
        r.lock();
        if (!update) {
            r.unlock();
            // 锁降级从写锁获取到开始
            w.lock();
            try {
                if (!update) {
                    // 准备数据的过程
                    update = true;
                }
                r.lock();
            } finally {
                w.unlock();
            }
        }

        try {
            // 使用数据的过程
        } finally {
            r.unlock();
        }
    }
}
