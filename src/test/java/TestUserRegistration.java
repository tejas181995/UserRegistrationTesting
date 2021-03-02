import com.bridgelabz.userregistration.UserREgistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestUserRegistration {
    UserREgistration operation;

    @BeforeEach
    public void setUp() {
        operation = new UserREgistration();
    }

    @Test
    public void testFirstName() {
        Assertions.assertTrue(operation.checkFirstName("Tejas"));
    }

    @Test
    public void testLastName() {
        Assertions.assertTrue(operation.checkLastName("Dev"));
    }
}
