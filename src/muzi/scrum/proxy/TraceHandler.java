package muzi.scrum.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理处理器
 * @author muzi
 */
public class TraceHandler implements InvocationHandler{

    /**
     * 具体的调用类
     */
    private Object target;

    public TraceHandler(Object obj) {
        target = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        /**
         * proxy  当前所持有的proxy对象
         * method 当前被调用的方法
         * args   方法参数
         */
        System.out.print(target);
        System.out.print("." + method.getName() + "(");
        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);
                if (i < args.length - 1) {
                    System.out.print(",");
                }
            }
        }
        System.out.print(")");
        return method.invoke(target, args);
    }
}
