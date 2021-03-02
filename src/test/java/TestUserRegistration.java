import com.bridgelabz.userregistration.UserREgistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


public class TestUserRegistration {
    UserREgistration operation;
    @ParameterizedTest
    @MethodSource("getEmailTests")
    public void test_email(String email, boolean expResult){
        Assertions.assertEquals(expResult, operation.checkEmail(email));
    }
    private static Stream<Arguments> getEmailTests(){
        return Stream.of(
                Arguments.of("abc@yahoo.com", true),
                Arguments.of("abc-100@yahoo.com", true),
                Arguments.of("abc.100@yahoo.com", true),
                Arguments.of("abc111@abc.com", true),
                Arguments.of("abc@.com.my", false),
                Arguments.of("abc@gmail.com.aa.au", false),
                Arguments.of(".abc@com.com",false),
                Arguments.of("abc+100@gmail.com",true)
        );
    }
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
