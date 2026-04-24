package Ejercicio4;

public class Cuenta {
    protected double saldo; // 'protected' para que CuentaAhorro pueda modificarlo

    public Cuenta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Depositado: " + monto + ". Nuevo saldo: " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }
}