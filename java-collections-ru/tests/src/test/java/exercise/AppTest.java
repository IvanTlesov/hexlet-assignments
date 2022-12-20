package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        assertThat(numbers1).isEqualTo(App.take(numbers1,4));
        // END
    }

    //принимает List<int> и число элементов
    //возвращает новый список, который содержит первые n элементов нового списка
}
