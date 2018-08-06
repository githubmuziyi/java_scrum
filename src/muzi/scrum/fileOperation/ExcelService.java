package muzi.scrum.fileOperation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * excle服务类
 */
public final class ExcelService {

    private static Map<String, Map<String, Set<String>>> resoverMap;

    static {
        Map<String, Set<String>> bankMap = new HashMap<>();
        Set<String> bankXInYeSet = new HashSet<>();
        bankXInYeSet.add("xinYeResover");
        bankMap.put("xinye", bankXInYeSet);
        resoverMap.put("bank", bankMap);
    }

    public static void parse(String type, String name, String resover) {
        switch (type) {
            case "bank" :
                break;
            case "loan" :
                break;
            default:
                break;
        }
    }

    public static void parse(String type, String name) {

    }
}
