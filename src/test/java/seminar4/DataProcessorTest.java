package seminar4;


import org.junit.jupiter.api.Test;
import ru.shopieva.seminar4.database.DataProcessor;
import ru.shopieva.seminar4.database.Database;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class DataProcessorTest {

    @Test
    void testQuery(){
        Database database = mock(Database.class);
        List<String> fakeData = Arrays.asList("Data1", "Data2", "Data3");
        when(database.query(anyString())).thenReturn(fakeData);

        DataProcessor dataProcessor = new DataProcessor(database);
        List<String> result = dataProcessor.processData("SELECT * FROM users");
        assertEquals(fakeData,result);

    }

}