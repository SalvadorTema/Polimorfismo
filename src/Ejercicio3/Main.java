package Ejercicio3;

public class Main {
    public static void main(String[] args) {
    	
        /* * EXPLICACIÓN:
         * 1. Herencia: 'Vendedor' extiende 'Empleado', obteniendo el atributo 'nombre'.
         * 2. Sobrescritura: 'resumen()' ahora incluye el dato de la comisión.
         * 3. Polimorfismo: Referencia de tipo 'Empleado' apuntando a un 'Vendedor'.
         */

        Empleado emp = new Vendedor("Carlos Pérez", 1500.50);

        System.out.println("Mostrando resumen del empleado:");
        emp.resumen(); 
    }
}