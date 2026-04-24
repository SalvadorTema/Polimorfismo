package Ejercicio1;

public class Main {
    public static void main(String[] args) {
    	
        /* * EXPLICACIÓN:
         * 1. Herencia: Se aplicó en la clase 'Perro' al extender de 'Animal'.
         * 2. Sobrescritura: Se sobrescribió el método hacerSonido()  para dar un comportamiento específico.
         * 3. Polimorfismo: Se usa una referencia de tipo base Animal para apuntar a un objeto hijo, Perro
         */

        Animal miMascota = new Perro();

        // Caso de prueba: Al llamar al método, se ejecutará el del Perro (Polimorfismo)
        System.out.println("Ejecutando prueba de sonido:");
        miMascota.hacerSonido(); 
    }
}
