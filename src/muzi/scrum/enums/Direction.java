package muzi.scrum.enums;

/**
 * Created by muzi on 2017/10/6.
 * 自定义枚举类
 */
abstract class Direction {

    public static final Direction FRONT = new Direction("前") {
        @Override
        void show() {
            System.out.println("前");
        }
    };
    public static final Direction BEHIND = new Direction("后") {
        @Override
        void show() {
            System.out.println("后");
        }
    };
    public static final Direction LEFT = new Direction("左") {
        @Override
        void show() {
            System.out.println("左");
        }
    };
    public static final Direction RIGHT = new Direction("右") {
        @Override
        void show() {
            System.out.println("右");
        }
    };

    private String name;

    private Direction(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    abstract void show();
}

class DirectionDemo {

    public static void main(String[] args) {

    }
}
