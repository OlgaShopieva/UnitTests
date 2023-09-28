package hw3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.shopieva.hw3.OddEvenNumber;
import static org.junit.jupiter.api.Assertions.*;

public class OddEvenNumberTest {

OddEvenNumber oddEvenNumberTest;

    @BeforeEach
    void testinit(){
    oddEvenNumberTest = new OddEvenNumber();
    }

    @Test
    public void testEvenNumber(){
    assertTrue(oddEvenNumberTest.checkOddEvenNumber(4));
    }

    @Test
    public void testOddNumber(){
        assertFalse(oddEvenNumberTest.checkOddEvenNumber(4));
    }
}
