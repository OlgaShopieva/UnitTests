package seminar5.number;

import org.junit.jupiter.api.Test;
import ru.shopieva.seminar5.number.MaxNumberModule;
import ru.shopieva.seminar5.number.RandomNumberModule;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxNumIntegrationTest {

    @Test
    void testMaxNumIntegration(){
        RandomNumberModule randomNumberModule = new RandomNumberModule();
        List<Integer> numbers = randomNumberModule.generateRandomNumber();

        MaxNumberModule maxNumberModule = new MaxNumberModule();
        int max = maxNumberModule.findMaxNumber(numbers);

        Collections.sort(numbers);

        assertEquals(numbers.get(numbers.size() - 1), max);
    }
}
