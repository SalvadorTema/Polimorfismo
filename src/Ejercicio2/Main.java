package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        /*
         * EXPLICACIÓN:
         * - Herencia: 'Rectangulo' hereda de 'Figura'.
         * - Sobrescritura: Se implementó la fórmula (base * altura) en el método area().
         * - Polimorfismo: Se usa una referencia de tipo 'Figura' para manejar un 'Rectangulo'.
         */

        // Referencia de tipo base 
        Figura miForma = new Rectangulo(5.0, 10.0);

        // Caso de prueba: Mostrar el resultado en consola
        System.out.println("El área calculada del rectángulo es: " + miForma.area());
    }
}