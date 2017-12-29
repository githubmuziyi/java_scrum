package muzi.scrum.reflect;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 通用反射工具类
 * @author muzi
 */
public class ObjectAnnlyzer {

    /**
     * 通用toString类
     * @param obj [实例]
     * @return [string]
     */
    public String toString(Object obj) {
        Class c1 = obj.getClass();
        String r = c1.getName();
        do {
            r += "[";
            Field[] fields = c1.getDeclaredFields();
            AccessibleObject.setAccessible(fields, true);
            for (Field f : fields) {
                if (Modifier.isStatic(f.getModifiers())) {
                    if (!r.endsWith("[")) {
                        r += ",";
                    }
                    r += f.getName() + "=";
                    try {
                        Object val = f.get(obj);
                        r += toString(val);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
            r += "]";
            c1 = c1.getSuperclass();
        } while (c1 != null);
        return r;
    }

    /**
     * 通用复制一个数组至新数组
     * @param a [原数组]
     * @param newLength [复制多长]
     * @return [新数组]
     */
    public static Object goodCopyOf(Object a, int newLength) {
        Class c1 = a.getClass();
        if (!c1.isArray()) {
            return null;
        }
        Class componentType = c1.getComponentType();
        int length = Array.getLength(a);
        Object newArray = Array.newInstance(componentType, newLength);
        System.arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
        return newArray;
    }
}
