package muzi.scrum.enums;

/**
 * Created by muzi on 2017/10/6.
 * JDK5提供的枚举类
 *
 * 枚举类注意事项：
 *  1.枚举类的第一行必须是枚举项
 *  2.枚举类可以有构造器，但必须是private
 *  3.枚举也可以有抽象方法，但枚举项必须重写该方法
 *
 *  方法：
 *      compareTo()
 *      name()
 *      ordinal()
 */
public enum DirectionEnum {
    FRONT("前") {
        @Override
        public void show() {
            System.out.println("前");
        }
    },
    BEHIND("后") {
        @Override
        public void show() {
            System.out.println("后");
        }
    },
    LEFT("左") {
        @Override
        public void show() {
            System.out.println("左");
        }
    },
    RIGHT("右") {
        @Override
        public void show() {
            System.out.println("右");
        }
    };

    private String name;

    private DirectionEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract void show();
}

class DirectionEnumTest {
    public static void main(String[] args) {
        DirectionEnum direction = DirectionEnum.FRONT;
        DirectionEnum direction1 = DirectionEnum.BEHIND;
        System.out.println(direction);
        System.out.println(direction.getName());
        direction.show();

        switch (direction) {
            case FRONT:
                System.out.println("你选择了前");
                break;
            case LEFT:
                System.out.println("你选择了左");
                break;
            default:
                break;
        }
        System.out.println(direction.compareTo(direction1)); //比较枚举项序号
        System.out.println(direction.name()); //枚举值
        System.out.println(direction.ordinal()); //枚举项序号
        DirectionEnum d = Enum.valueOf(DirectionEnum.class, "FRONT"); //获取枚举对象
        System.out.println(d);
        DirectionEnum[] directionEna = DirectionEnum.values(); //获取全部枚举项
    }
}
