package Ejercicio4;

public class CuentaAhorro extends Cuenta {
 private double interes = 0.02; // Ejemplo: 2% de interés adicional por depósito

 public CuentaAhorro(double saldoInicial) {
     super(saldoInicial);
 }

 // SOBRESCRITURA: Al depositar, se le suma un pequeño interés extra
 @Override
 public void depositar(double monto) {
     double montoConInteres = monto + (monto * interes);
     this.saldo += montoConInteres;
     System.out.println("Depositado (con 2% interés): " + montoConInteres + ". Saldo total: " + saldo);
 }
}