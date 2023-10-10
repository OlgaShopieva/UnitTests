package seminar5.user;

import org.junit.jupiter.api.Test;
import ru.shopieva.seminar5.user.UserRepository;
import ru.shopieva.seminar5.user.UserService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserIntegrationTest {

    @Test
    void testIntegrationGetUserById(){
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);

        assertEquals(userRepository.getUserById(3), userService.getUserName(3));
    }
}
