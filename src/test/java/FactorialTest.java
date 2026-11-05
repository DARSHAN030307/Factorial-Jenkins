
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialTest {

    @Test
    void testFactorial() {
        Factorial factorial = new Factorial();

        assertEquals(120, factorial.factorial(5));
        assertEquals(1, factorial.factorial(0));
        assertEquals(1, factorial.factorial(1));
    }
}
