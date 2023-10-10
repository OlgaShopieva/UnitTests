package seminar5.number;

import org.junit.jupiter.api.Test;
import ru.shopieva.seminar5.number.RandomNumberModule;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RandomNumberModuleTest {
    @Test
    void testGenerateRandomNumbers(){
        List<Integer> nums = Arrays.asList(1,4,5,2,6,2,8,2);
        RandomNumberModule randomNumberModule = mock(RandomNumberModule.class);
        when(randomNumberModule.generateRandomNumber()).thenReturn(nums);

        assertEquals(nums, randomNumberModule.generateRandomNumber());


    }

}
