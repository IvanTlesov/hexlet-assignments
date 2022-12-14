package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map getWordCount(String sentence) {
        Map<String, Integer> wordsCount = new HashMap<>();

        if (sentence.isEmpty()) {
            return wordsCount;
        }

        String[] sentenceArray = sentence.split(" ");

        for (String line : sentenceArray) {
            int count = 1;
            for (Map.Entry<String, Integer> wordCount : wordsCount.entrySet()) {
                if (wordCount.getKey().equals(line)) {
                    count = wordCount.getValue() + 1;
                }
            }
            wordsCount.put(line, count);
        }
        return wordsCount;
    }

    public static String toString(Map<String, Integer> wordsCount) {

        if (wordsCount.isEmpty()) {
            return "{}";
        }

        String result = "{\n";
        for (Map.Entry<String, Integer> wordCount : wordsCount.entrySet()) {
            result = result + "  " + wordCount.getKey() + ": " + wordCount.getValue() + "\n";
        }
        result = result + "}";
        return result;
    }
}
//END
