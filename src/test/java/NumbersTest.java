import org.junit.jupiter.api.Test;
import ru.shopieva.hw6.Numbers;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumbersTest {
    @Test
    void testCalculateAverage() {
        // Arrange
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        // Act
        double average = Numbers.calculateAverage(list);

        // Assert
        assertEquals(20.0, average);
    }

    @Test
    void testCompareAverages_FirstGreater() {
        // Arrange
        double inputAverage1 = 25.0;
        double inputAverage2 = 20.0;

        // Act
        // Redirect console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        Numbers.compareAverages(inputAverage1, inputAverage2);
        String consoleOutput = outputStream.toString().trim();

        // Assert
        assertEquals("Первый список имеет большее среднее значение", consoleOutput);
    }

    @Test
    void testCompareAverages_SecondGreater() {
        // Arrange
        double inputAverage1 = 20.0;
        double inputAverage2 = 25.0;

        // Act
        // Redirect console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        Numbers.compareAverages(inputAverage1, inputAverage2);
        String consoleOutput = outputStream.toString().trim();

        // Assert
        assertEquals("Второй список имеет большее среднее значение", consoleOutput);
    }

    @Test
    void testCompareAverages_Equal() {
        // Arrange
        double inputAverage1 = 20.0;
        double inputAverage2 = 20.0;

        // Act
        // Redirect console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        Numbers.compareAverages(inputAverage1, inputAverage2);
        String consoleOutput = outputStream.toString().trim();

        // Assert
        assertEquals("Средние значения равны", consoleOutput);
    }
}
