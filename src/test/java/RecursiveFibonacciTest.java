import com.epsi.b3a.RecursiveFibonacci;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class RecursiveFibonacciTest {
    @ParameterizedTest(name = "f({0}) = {1}")
    @CsvSource({
            "0, 0",
            "1, 1",
            "3, 2",
            "7, 13",
            "14, 377",
            "50, 12586269025",
            "100, 3736710778780434371",
    })
    void testFibonacci(int first, long expected) {
        RecursiveFibonacci fibonacci = new RecursiveFibonacci();
        assertEquals(expected, fibonacci.calculate(first));
    }

    private static Stream<Arguments> fibonacciTests() {
        return Stream.of(
                arguments(0, 0L),
                arguments(1, 1L),
                arguments(3, 2L),
                arguments(7, 13L),
                arguments(14, 377L),
                arguments(50, 12586269025L),
                arguments(100, 3736710778780434371L)
        );
    }
}
