package Ejercicio3;

public class Empleado {
 protected String nombre; // Usamos protected para que la subclase pueda acceder

 public Empleado(String nombre) {
     this.nombre = nombre;
 }

 public void resumen() {
     System.out.println("Empleado: " + nombre);
 }
}