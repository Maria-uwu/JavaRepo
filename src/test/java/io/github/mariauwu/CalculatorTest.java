package io.github.mariauwu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testSuma() {
        Calculator calc = new Calculator();
        double resultado = calc.sumar(2, 3);
        System.out.println("Resultado de la suma: " + resultado);
        assertEquals(5, resultado, "La suma de 2 + 3 debería ser 5");
    }

    @Test
    void testResta() {
        Calculator calc = new Calculator();
        double resultado = calc.restar(5, 2);
        System.out.println("Resultado de la resta: " + resultado);
        assertEquals(3, resultado, "La resta de 5 - 2 debería ser 3");
    }
    @Test
    void testMultiplicacion() {
        Calculator calc = new Calculator();
        double resultado = calc.multiplicar(5, 2);
        System.out.println("Resultado de la multiplicacion: " + resultado);
        assertEquals(10, resultado, "La multiplicacion de 5 * 2 debería ser 10");
    }
    @Test
    void testDivision() {
        Calculator calc = new Calculator();
        double resultado = calc.dividir(10, 2);
        System.out.println("Resultado de la division: " + resultado);
        assertEquals(5, resultado, "La division de 10 / 2 debería ser 5");
    }
}
