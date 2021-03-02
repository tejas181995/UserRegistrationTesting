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

    @Test
    public void testLastName() {
        boolean result;
        result = operation.checkLastName("gev");
        System.out.println(result);
        Assertions.assertTrue(result);
    }

    @Test
    public void checkEmail() {
        boolean result;
        result = operation.checkEmail("tejasdev95@gmail.com");
        System.out.println(result);
        Assertions.assertTrue(result);
    }

    @Test
    void checkPhoneNumber() {
        boolean result;
        result = operation.checkPhoneNumber("91 9767998269");
        System.out.println(result);
        Assertions.assertTrue(result);
    }
}
