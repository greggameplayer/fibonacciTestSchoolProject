import com.epsi.b3a.RecursiveFibonacci;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RecursiveFibonacciTest {

    private static RecursiveFibonacci fibonacci;

    @BeforeAll
    static void setUp() {
        fibonacci = new RecursiveFibonacci();
    }



    @ParameterizedTest(name = "f({0}) = {1}")
    @CsvSource({
            "0, 0",
            "1, 1",
            "3, 2",
            "7, 13",
            "14, 377",
            "50, 12586269025",
            "100, 3736710778780434371"
    })
    void testFibonacci(int first, long expected) {
        assertEquals(expected, fibonacci.calculate(first));
    }

    @ParameterizedTest(name = "f({0})")
    @CsvSource({
            "-1",
            "-10"
    })
    void testFibonacciException(int first) {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> fibonacci.calculate(first));
        assertEquals("n must be positive", exception.getMessage());
    }
}
