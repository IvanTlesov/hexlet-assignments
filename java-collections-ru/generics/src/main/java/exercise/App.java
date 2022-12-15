package exercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> result = new ArrayList<>();
        for (Map<String, String> book : books) {
            boolean isContain = true;
            for (Map.Entry<String, String> wheres : where.entrySet()) {
                String wheresKey = wheres.getKey();
                String wheresValue = wheres.getValue();
                String bookValue = book.get(wheresKey);
                if (!wheresValue.equals(bookValue)) {
                    isContain = false;
                    break;
                }
            }
            if (isContain) {
                result.add(book);
            }
        }
        return result;
    }
}
//END
