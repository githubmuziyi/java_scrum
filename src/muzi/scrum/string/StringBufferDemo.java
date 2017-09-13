package muzi.scrum.string;

/**
 * Created by muzi on 2017/9/13.
 * 线程安全：数据是安全的
 * StringBuffer: 线程安全的可变字符串
 * 和String的区别：前者长度和内容可变，后者不可改变
 */
class StringBufferDemo {

    /**
     * public StringBuffer()
     * public StringBuffer(int capacity) 指定容量的字符串缓冲区对象
     * public StringBuffer(String str) 指定字符串内容的字符串缓冲区对象
     * public int capacity() 返回当前容量
     * public int length() 返回长度
     */
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println("sb：" + sb);
        System.out.println("sb.capacity():" + sb.capacity());
        System.out.println("sb.length():" + sb.length());
        StringBuffer sb2 = new StringBuffer(50);
        System.out.println("sb2.capacity():" + sb2.capacity());
        StringBuffer sb3 = new StringBuffer("hello");
        System.out.println("sb3.capacity()" + sb3.capacity());
        /**
         * StringBuffer的添加功能
         * public StringBuffer append(String str) 可以吧任意类型添加到字符串缓冲区,并返回缓冲区本身
         * public StringBuffer insert(int offset, String str) 在指定位置把任意类型的额数据插入到缓冲区，返回本身
         */
        sb.append("hello");
        System.out.println("sb:" + sb);
        sb.insert(2, "world");
        System.out.println("sb:" + sb);
        /**
         * public StringBuffer deleteCharAt(int index)
         * public StringBuffer delete(int start, int end)
         */
        sb.deleteCharAt(3);
        System.out.println("sb:" + sb);
        sb.delete(4, 8);
        System.out.println("sb:" + sb);
        /**
         * public StringBuffer replace(int start, int end, String str)
         */
        sb.replace(1, 3, "mmmmmm");
        System.out.println("sb:" + sb);
        /**
         * public StringBuffer reverse() 反转功能
         */
        sb.reverse();
        System.out.println("sb:" + sb);
        /**
         * 截取功能
         * public String substring(int start) 返回一个Sting对象，StringBuffer本身不变
         * public String substring(int start, int end)
         */
        String s = sb.substring(3);
        System.out.println("s:" + s);
        System.out.println("sb:" + sb);
    }
}
