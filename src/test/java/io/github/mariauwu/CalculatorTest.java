package io.github.mariauwu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testSuma() {
        Calculator calc = new Calculator();
        double resultado = calc.sumar(2, 3);
        assertEquals(5, resultado, "La suma de 2 + 3 debería ser 5");
    }

    @Test
    void testResta() {
        Calculator calc = new Calculator();
        double resultado = calc.restar(5, 2);
        assertEquals(3, resultado, "La resta de 5 - 2 debería ser 3");
    }
}
