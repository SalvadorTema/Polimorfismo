package Ejercicio7;

public class Main {
    public static void main(String[] args) {
        /*
         * EXPLICACIÓN:
         * - Herencia: 'Motocicleta' hereda de 'Vehiculo'.
         * - Sobrescritura: Se especializó el método 'encender()'.
         * - Polimorfismo: Se usa el tipo 'Vehiculo' para instanciar una 'Motocicleta'.
         */

        Vehiculo miMoto = new Motocicleta();

        System.out.println("- Prueba de Encendido -");
        miMoto.encender(); 
    }
}
