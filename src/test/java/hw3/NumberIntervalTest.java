package hw3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.shopieva.hw3.NumberInterval;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberIntervalTest {
    NumberInterval numberIntervalTest;

    @BeforeEach
    public void testInit(){
        numberIntervalTest = new NumberInterval();
    }

    @Test
    public void testPositiveNumberBetween25And100(){
        assertTrue(numberIntervalTest.checkNumberInInterval(25));
    }

    @Test
    public void testPositiveNumberOutOfInterval(){
        assertFalse(numberIntervalTest.checkNumberInInterval(24));
    }

    @Test
    public void testNegativeNumber(){
        assertFalse(numberIntervalTest.checkNumberInInterval(-10));
    }

}
