import dev.kameleonnn.hello.Hello;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloTest {

    /**
     * Test of greet method, of class Hello.
     */
    @Test
    public void testGreet() {
        System.out.println("greet");
        String expResult = "Hello, Adam!";
        String result = Hello.greet("Adam");
        assertEquals(expResult, result);
    }
    
}
