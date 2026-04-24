package Ejercicio6;

public class Main {
    public static void main(String[] args) {
        /*
         * EXPLICACIÓN:
         * - Herencia: 'Estudiante' hereda de 'Persona'.
         * - Sobrescritura: Se modificó 'presentarse()' para incluir datos específicos (carnet/carrera).
         * - Polimorfismo: Referencia 'Persona' apuntando a un objeto 'Estudiante'.
         */

        Persona alguien = new Estudiante("Ana García", "2026-0015", "Ingeniería de Software");

        System.out.println("--- Prueba de Presentación ---");
        alguien.presentarse();
    }
}
