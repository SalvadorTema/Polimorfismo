package Ejercicio9;

public class Main {
    public static void main(String[] args) {
        /*
         * EXPLICACIÓN ENTREGABLE:
         * - Herencia: 'Guitarra' extiende la clase 'Instrumento'.
         * - Sobrescritura: Se redefinió 'tocar()' para simular el sonido de cuerdas.
         * - Polimorfismo: Referencia tipo 'Instrumento' apuntando a un objeto 'Guitarra'.
         */

        Instrumento miInstrumento = new Guitarra();

        System.out.println("Iniciando concierto:");
        miInstrumento.tocar();
    }
}
