package Ejercicio4;

public class Main {
    public static void main(String[] args) {
    	
        /* * EXPLICACIÓN:
         * 1. Herencia: 'CuentaAhorro' extiende 'Cuenta'.
         * 2. Sobrescritura: 'depositar' ahora calcula un interés antes de sumar al saldo.
         * 3. Polimorfismo: Referencia de tipo 'Cuenta' apuntando a 'CuentaAhorro'.
         */

        // Referencia de tipo base (Cuenta) apuntando a objeto hijo (CuentaAhorro)
        Cuenta miCuenta = new CuentaAhorro(1000.0);

        // Caso de prueba: Si depositamos 500, debería sumarse el interés adicional
        miCuenta.depositar(500.0);
    }
}