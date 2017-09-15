package muzi.scrum.character;

/**
 * Created by muzi on 2017/9/15.
 * Character:
 *  类在对象中包装了一个基本类型char的值
 *  此外，该类提供了几个方法，以确定字符的类别（大小写，数字等），并将大小写互转
 */
class CharacterDemo {

    public static void main(String[] args) {
        Character chr = new Character('a');
        System.out.println("chr:" + chr);

        /**
         * isUpperCase(char ch)
         * isLowerCase(char ch)
         * isDigit(char ch)
         * toUpperCase(char ch)
         * toLowerCase(char ch)
         */
        System.out.println(Character.isUpperCase('Y'));
        System.out.println(Character.isLowerCase('Y'));
        System.out.println(Character.isDigit('6'));
        System.out.println(Character.toUpperCase('y'));
        System.out.println(Character.toLowerCase('Y'));
    }
}
