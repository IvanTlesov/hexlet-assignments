package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {
    public static long getCountOfFreeEmails(List<String> inputList) {
        List<String> freeList = List.of("gmail.com", "yandex.ru", "hotmail.com");

        return inputList.stream()
                .map(element -> element.split("@")[1])
                .filter(element -> freeList.contains(element))
                .count();
    }
}
// END
