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
    public void testFirstName_true() {
        boolean result;
        result = operation.checkFirstName("Tejas");
        System.out.println(result);
        Assertions.assertTrue(result);
    }
    @Test
    public void testFirstName_false() {
        boolean result;
        result = operation.checkFirstName("tejas");
        System.out.println(result);
        Assertions.assertFalse(result);
    }

    @Test
    public void testLastName_true() {
        boolean result;
        result = operation.checkLastName("Dev");
        System.out.println(result);
        Assertions.assertTrue(result);
    }
    public void testLastName_false() {
        boolean result;
        result = operation.checkLastName("dev");
        System.out.println(result);
        Assertions.assertFalse(result);
    }

    @Test
    public void checkEmail_true() {
        boolean result;
        result = operation.checkEmail("tejasdev95@gmail.com");
        System.out.println(result);
        Assertions.assertTrue(result);
    }
    @Test
    public void checkEmail_false() {
        boolean result;
        result = operation.checkEmail("tejasdev95@gmail.com");
        System.out.println(result);
        Assertions.assertFalse(result);
    }

    @Test
    public void checkPhoneNumber_true() {
        boolean result;
        result = operation.checkPhoneNumber("91 9767998269");
        System.out.println(result);
        Assertions.assertTrue(result);
    }
    @Test
    public void checkPhoneNumber_false() {
        boolean result;
        result = operation.checkPhoneNumber("91 9767998269");
        System.out.println(result);
        Assertions.assertFalse(result);
    }

    @Test
    public void checkPassword_true() {
        boolean result;
        result = operation.checkPassword("Qwerty@123");
        System.out.println(result);
        Assertions.assertTrue(result);
    }
    @Test
    public void checkPassword_false() {
        boolean result;
        result = operation.checkPassword("Qwerty@123");
        System.out.println(result);
        Assertions.assertFalse(result);
    }
}
