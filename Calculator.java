public class Calculator {
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Método para dividir dos números (con manejo de división por cero)
    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        double num1 = 10;
        double num2 = 5;

        System.out.println("Multiplicación: " + multiplicar(num1, num2));
        System.out.println("División: " + dividir(num1, num2));
    }
}
