package seminar4;


import org.junit.jupiter.api.Test;
import ru.shopieva.seminar4.message.MessageService;
import ru.shopieva.seminar4.message.NotificationService;

import static org.mockito.Mockito.*;

class NotificationServiceTest {

    @Test
    void testSendMessage(){
        MessageService messageService = mock(MessageService.class);

        NotificationService notificationService = new NotificationService(messageService);
        notificationService.sendNotification("Hello World", "Ivan");

        verify(messageService, times(1)).sendMessage("Hello World", "Ivan");

    }

}