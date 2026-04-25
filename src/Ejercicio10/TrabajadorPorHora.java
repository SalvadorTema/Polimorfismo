package Ejercicio10;

public class TrabajadorPorHora extends Trabajador {
 private int horasTrabajadas;
 private double pagoPorHora;

 public TrabajadorPorHora(int horasTrabajadas, double pagoPorHora) {
     this.horasTrabajadas = horasTrabajadas;
     this.pagoPorHora = pagoPorHora;
 }

 // Calculamos el pago real multiplicando horas por tarifa
 @Override
 public double calcularPago() {
     return horasTrabajadas * pagoPorHora;
 }
}