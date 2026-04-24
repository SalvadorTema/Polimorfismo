package Ejercicio8;

public class Main {
    public static void main(String[] args) {
        /*
         * EXPLICACIÓN:
         * - Herencia: 'ProductoDigital' extiende 'Producto'.
         * - Sobrescritura: Se especializó 'mostrarDescripcion()' para incluir el tamaño en MB.
         * - Polimorfismo: Referencia tipo 'Producto' apuntando a 'ProductoDigital'.
         */
        
        Producto miEbook = new ProductoDigital("Guía de Java 2026", 19.99, 15.5);

        System.out.println("--- Detalle del Producto ---");
        miEbook.mostrarDescripcion();
    }
}
