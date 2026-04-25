package Ejercicio10;

public class Main {
    public static void main(String[] args) {
        /*
         * EXPLICACIÓN FINAL DEL ENTREGABLE:
         * - Herencia: 'TrabajadorPorHora' hereda de 'Trabajador'.
         * - Sobrescritura: Se implementó la lógica de cálculo (horas * precio) en 'calcularPago()'.
         * - Polimorfismo: Se usa el tipo 'Trabajador' para manejar un 'TrabajadorPorHora'.
         */

        Trabajador empleado = new TrabajadorPorHora(40, 25.50);

        double sueldoTotal = empleado.calcularPago();
        System.out.println("Cálculo de Nómina:");
        System.out.println("El pago total del trabajador es: $" + sueldoTotal);
    }
}
