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
        boolean result;
        result = operation.checkFirstName("Tejas");
        System.out.println(result);
        Assertions.assertTrue(result);
    }
}
