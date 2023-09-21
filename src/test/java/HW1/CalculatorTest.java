package HW1;

import ru.shopieva.HW1.Calculator;

import static org.assertj.core.api.Assertions.*;


public class CalculatorTest {

    public static void main(String[] args) {
        assertThat(Calculator.calculateDiscount(2000,15)).isEqualTo(1700);
        assertThat(Calculator.calculateDiscount(1000,10)).isEqualTo(900);
        assertThat(Calculator.calculateDiscount(3000, 20)).isEqualTo(2400);

        if((Calculator.calculateDiscount(-2000,15) < 0)) {
            throw new AssertionError("Incorrect input!");
        }
    }
}

