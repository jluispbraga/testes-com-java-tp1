import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ScientificCalculatorTest {

    private ScientificCalculator calculator = new ScientificCalculator();

    @BeforeEach
    void setUp() {
        calculator = new ScientificCalculator();
    }

    // Testes de operações básicas
    @Test
    void shouldAddTwoNumbersCorrectly() {
        double result = calculator.add(10, 5);
        assertEquals(15, result, 0.0001);
    }

    @Test
    void shouldSubtractSecondNumberFromFirstCorrectly() {
        // Setup
        double a = 10;
        double b = 3;

        // Execution
        double result = calculator.subtract(a, b);

        // Assertion
        assertEquals(7, result, 0.0001);
        // Teardown
    }

    @Test
    void shouldThrowExceptionWhenDividingByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }

    // Testes de funções matemáticas
    @Test
    void shouldReturnSquareRootOfPositiveNumber() {
        assertEquals(5, calculator.squareRoot(25), 0.0001);
    }

    @Test
    void shouldThrowExceptionWhenSquareRootOfNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> calculator.squareRoot(-4));
    }

    // Testes de funções trigonométricas
    @Test
    void shouldReturnLogOfPositiveNumber() {
        assertEquals(0, calculator.log(1), 0.0001);
    }

    @Test
    void shouldReturnSinOf90DegreesAsOne() {
        assertEquals(1, calculator.sin(90), 0.0001);
    }


}