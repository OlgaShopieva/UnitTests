package seminar5.number;

import org.junit.jupiter.api.Test;
import ru.shopieva.seminar5.number.MaxNumberModule;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MaxNumberModuleTest {

    @Test
    void findMaxNumberTest(){
        List<Integer> nums = Arrays.asList(1, 4,8,3, 5,3,10);
        MaxNumberModule maxNumberModule = mock(MaxNumberModule.class);
        when(maxNumberModule.findMaxNumber(nums)).thenReturn(10);

        assertEquals(10, maxNumberModule.findMaxNumber(nums));
    }

}
