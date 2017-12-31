package muzi.scrum.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class ProxyMotion {

    public static void main(String[] args) {

        ArrayList<String> content = new ArrayList<>();
        InvocationHandler handler = new MyInvocationHandler(content);
        Object proxy = Proxy.newProxyInstance(null, new Class[] {List.class}, handler);
        if (proxy instanceof List) {
            System.out.println("proxy is list");
            List<String> mlist = (List<String>) proxy;
            mlist.add("orange");
            mlist.add("milk");
            mlist.add("apple");
        }
        System.out.println(proxy.toString());
        System.out.println(content.toString());
    }
}
