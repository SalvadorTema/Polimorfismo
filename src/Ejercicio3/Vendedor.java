package Ejercicio3;

public class Vendedor extends Empleado {
 private double comision;

 public Vendedor(String nombre, double comision) {
     super(nombre); // Llama al constructor de la clase base Empleado
     this.comision = comision;
 }

 @Override
 public void resumen() {
     System.out.println("Vendedor: " + nombre + " | Comisión: $" + comision);
 }
}