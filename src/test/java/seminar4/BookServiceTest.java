package seminar4;


import org.junit.jupiter.api.Test;
import ru.shopieva.seminar4.hotel.BookingService;
import ru.shopieva.seminar4.hotel.HotelService;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookServiceTest {

    @Test
    void testAvailableRoom(){
        HotelService testHotelService = mock(HotelService.class);

        when(testHotelService.isRoomAvailable(anyInt())).thenReturn(true);

        BookingService bookingService = new BookingService(testHotelService);

        assertTrue(bookingService.bookRoom(404));
    }

}