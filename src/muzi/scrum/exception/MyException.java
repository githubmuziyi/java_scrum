package muzi.scrum.exception;

/**
 * Created by muzi on 2017/9/25.
 * 自定义异常：
 *  1.继承Exception
 *  2.继承RuntimeException
 */
class MyException extends Exception {

    public MyException() {
        super();
    }

    public MyException(String msg) {
        super(msg);
    }
}

class Teacher {
    public void check(int score) throws MyException {
        if (score > 100 || score < 0) {
            throw new MyException("分数在0-100");
        } else {
            System.out.println("ook");
        }
    }
}

class MyExceptionTest {
    public static void main(String[] args) {

    }
}
