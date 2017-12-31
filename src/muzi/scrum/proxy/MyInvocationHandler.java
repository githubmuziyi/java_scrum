package muzi.scrum.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler{

    private Object target;

    public MyInvocationHandler(Object obj) {
        target = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("method name:" + method.getName());
        if ("add".equals(method.getName())) {
            if (args[0].equals("apple")) {
                return false;
            }
        }
        return method.invoke(target, args);
    }
}
