package muzi.scrum.string;

/**
 * Created by muzi on 2017/9/12.
 */
class StringTest02 {

    public static void main(String[] args) {
        String s = "helloworld";
        int length = s.length();
        for (int i = 0; i < length; i++) {
            System.out.println(s.charAt(i));
        }
        String s1 = "Hello123World";
        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch >= '0' && ch <= '9') {
                numCount++;
            }
            if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            }
            if (ch >= 'A' && ch <= 'Z') {
                bigCount++;
            }
        }
        System.out.println("bigCount:" + bigCount);
        System.out.println("smallCount:" + smallCount);
        System.out.println("numCount:" + numCount);
    }
}
