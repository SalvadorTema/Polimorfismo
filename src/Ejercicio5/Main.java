package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        /*
         * EXPLICACIÓN:
         * - Herencia: 'Avion' extiende de 'Transporte'.
         * - Sobrescritura: Se cambió el mensaje genérico de moverse() por uno de vuelo.
         * - Polimorfismo: La variable es de tipo 'Transporte', pero el objeto es un 'Avion'.
         */
    	
        Transporte miVehiculo = new Avion();

        System.out.print("Acción del transporte: ");
        miVehiculo.moverse();
    }
}