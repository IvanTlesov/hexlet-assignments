package exercise;

import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String symbols, String word) {
        boolean result = true;

        if (symbols.length() == 0) {
            return false;
        }

        List<Character> list = new ArrayList<>();

        for (int i = 0; i < symbols.length(); i++) {
            list.add(symbols.charAt(i));
        }

        String lowerWord = word.toLowerCase();
        int count = 0;

        while (result) {
            if (count == lowerWord.length()) {
                break;
            }

            for (int i = 0; i < lowerWord.length(); i++) {
                if (list.remove((Character) lowerWord.charAt(i))) {
                    count++;
                } else {
                    result = false;
                }
            }
        }

        return result;
    }
}
//END
