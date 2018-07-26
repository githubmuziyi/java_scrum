package muzi.scrum.java8.optional;

import java.util.Optional;
import java.util.Properties;

/**
 * optional封装可能为null的值
 * @author muzi
 */
public class OptionalUtility {

    /**
     * String转Int
     * @param s
     * @return
     */
    public static Optional<Integer> stringToInt(String s) {
        try {
            return Optional.of(Integer.parseInt(s));
        } catch (NumberFormatException ex) {
            return Optional.empty();
        }
    }

    /**
     * java8之前的写法
     * @param properties
     * @param name
     * @return
     */
    public int readDuration(Properties properties, String name) {
        String value = properties.getProperty(name);
        if (value != null) {
            try {
                int i = Integer.parseInt(value);
                if (i > 0) {
                    return i;
                }
            } catch (NumberFormatException e) {}
        }
        return 0;
    }

    /**
     * java8的写法实现
     */
    public int readDurationJava8(Properties properties, String name) {
        return Optional.ofNullable(properties.getProperty(name))
                .flatMap(OptionalUtility::stringToInt)
                .filter(i -> i > 0)
                .orElse(0);
        }

}
