package exercise;

import java.util.*;

// BEGIN
class App {
    public static Map<String, String> genDiff(Map<String, Object> firstMap, Map<String, Object> secondMap) {
        Map<String, String> resultMap = new LinkedHashMap<>();
        for (Map.Entry element : firstMap.entrySet()) {
            resultMap.put(element.getKey().toString(), choiceValue(firstMap, secondMap, element.getKey().toString()));
        }
        for (Map.Entry element : secondMap.entrySet()) {
            resultMap.put(element.getKey().toString(), choiceValue(firstMap, secondMap, element.getKey().toString()));
        }
        return resultMap;
    }

    static String choiceValue(Map<String, Object> firstMap, Map<String, Object> secondMap, String k) {
        if (!firstMap.containsKey(k) && (secondMap.containsKey(k))) {
            return "added";
        } else if (firstMap.containsKey(k) && (!secondMap.containsKey(k))) {
            return "deleted";
        } else if (firstMap.containsKey(k) && secondMap.containsKey(k)) {
            if (firstMap.get(k).equals(secondMap.get(k))) {
                return "unchanged";
            }
        }
        return "changed";
    }
}
//END
