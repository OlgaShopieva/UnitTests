package seminar4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Iterator;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MainTest {
    @Test
    public void iteratorWillReturnHelloWorld() {
        // Arrange
        Iterator iteratorMock = mock(Iterator.class);
        when(iteratorMock.next()).thenReturn("Hello", "World");
        // Act
        String result = iteratorMock.next() + " " + iteratorMock.next();
        // ...
        assertEquals("Hello World", result);
    }
}

