import com.bridgelabz.userregistration.UserRegException;
import com.bridgelabz.userregistration.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


public class TestUserRegistration {
    UserRegistration operation;
  /*  @ParameterizedTest
    @MethodSource("getEmailTests")
    public void test_email(String email, boolean expResult) throws UserRegException {
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
                Arguments.of(".abc@com.com",true),
                Arguments.of("abc+100@gmail.com",true)
        );
    }*/
    @BeforeEach
    public void setUp() {
        operation = new UserRegistration();
    }

    @Test
    public void testFirstName_true() {
        Assertions.assertDoesNotThrow(() -> {
            operation.checkFirstName("Tejas");
        });
    }
    @Test
    public void testFirstName_false() {
        Assertions.assertThrows(UserRegException.class, () -> {
            operation.checkFirstName("tejas");
        });
    }

    @Test
    public void testLastName_true() {
        Assertions.assertDoesNotThrow(() -> {
            operation.checkLastName("Dev");
        });
    }
    @Test
    public void testLastName_false() {
        Assertions.assertThrows(UserRegException.class, () -> {
            operation.checkLastName("dev");
        });
    }

    @Test
    public void checkEmail_true() {
        Assertions.assertDoesNotThrow(() -> {
            operation.checkEmail("tejasdev95@gmail.com");
        });
    }
    @Test
    public void checkEmail_false() {
        Assertions.assertThrows(UserRegException.class, () -> {
            operation.checkEmail("tejas@.com.aa.asd");
        });
    }

    @Test
    public void checkPhoneNumber_true() {
        Assertions.assertDoesNotThrow(() -> {
            operation.checkPhoneNumber("91 9767998269");
        });
    }
    @Test
    public void checkPhoneNumber_false() {
        Assertions.assertThrows(UserRegException.class, () -> {
            operation.checkPhoneNumber("919767998269");
         });
    }
    @Test
    public void checkPassword_true() {
        Assertions.assertDoesNotThrow(() -> {
            operation.checkPassword("Qwsd@12345");
        });
    }

}
