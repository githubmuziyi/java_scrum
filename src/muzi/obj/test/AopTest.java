package muzi.obj.test;

import muzi.obj.dao.StudentDao;
import muzi.obj.dao.impl.StudentDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by muzi on 2017/10/6.
 */
class AopTest {

    public static void main(String[] args) {
        StudentDao student = new StudentDaoImpl();
        student.login();
        student.regist();
        System.out.println("--------------");
        //通过Proxy类创建动态代理
        MyInvocationHandle myInvocationHandle = new MyInvocationHandle(student);
        StudentDao proxy = (StudentDao) Proxy.newProxyInstance(student.getClass().getClassLoader(),
                student.getClass().getInterfaces(), myInvocationHandle);
        proxy.login();
        proxy.regist();
    }
}

class MyInvocationHandle implements InvocationHandler {
    private Object target; //目标对象

    public MyInvocationHandle(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //前置操作
        System.out.println("前置操作");
        Object result = method.invoke(target, args);
        //后置操作
        System.out.println("后置操作");
        return result;
    }
}
