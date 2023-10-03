package seminar4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import ru.shopieva.seminar4.weather.WeatherReporter;
import ru.shopieva.seminar4.weather.WeatherService;

public class WeatherReportTest {

    @Test
    void testWeatherReportGetCurrentTemperature(){
        WeatherService testWeatherService = mock(WeatherService.class);

        when(testWeatherService.getCurrentTemperature()).thenReturn(25);

        WeatherReporter testWeatherReporter = new WeatherReporter(testWeatherService);

        assertEquals("Текущая температура: 25 градусов.", testWeatherReporter.generateReport());

    }
}
