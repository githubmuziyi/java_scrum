package muzi.scrum.thread;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/**
 * 简单的数据库连接池
 */
public class ConnectionPool {

    private LinkedList<Connection> connectionsPool = new LinkedList<>();

    /**
     * 初始化连接池
     * @param initialSize [容积]
     */
    public ConnectionPool(int initialSize) {
        if (initialSize > 0) {
            for (int i = 0; i < initialSize; i++) {
                connectionsPool.addLast(ConnectionDrive.createConnection());
            }
        }
    }

    /**
     * 释放链接，归还到连接池
     */
    public void releaseConnection(Connection connection) {
        if (connection != null) {
            synchronized (connectionsPool) {
                connectionsPool.addLast(connection);
                // 通知其他消费之已经有一个链接被归还到连接池
                connectionsPool.notifyAll();
            }
        }
    }

    /**
     * 从连接池中获取链接，超时时返回null
     */
    public Connection fetchConnetion(long timeOut) throws InterruptedException {
        synchronized (connectionsPool) {
            // 未设置超时，一直等待知道连接池存在链接
            if (timeOut <= 0) {
                while (connectionsPool.isEmpty()) {
                    connectionsPool.wait();
                }
                return connectionsPool.removeFirst();
            } else {
                long future = System.currentTimeMillis() + timeOut;
                long reaming = timeOut;
                while (connectionsPool.isEmpty() && reaming > 0) {
                    connectionsPool.wait(reaming);
                    reaming = future - System.currentTimeMillis();
                }
                Connection result = null;
                if (!connectionsPool.isEmpty()) {
                    result = connectionsPool.removeFirst();
                }
                return result;
            }
        }
    }

    /**
     * 创建链接驱动
     */
    public static class ConnectionDrive {

        static class ConnectionHandler implements InvocationHandler {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getName().equals("commit")) {
                    TimeUnit.MILLISECONDS.sleep(100);
                }
                return null;
            }
        }

        /**
         * 创建一个connection链接
         */
        public static Connection createConnection() {
            return (Connection) Proxy.newProxyInstance(ConnectionDrive.class.getClassLoader(),
                        new Class[]{Connection.class}, new ConnectionHandler());
        }
    }
}
