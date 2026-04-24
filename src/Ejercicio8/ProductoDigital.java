package Ejercicio8;


public class ProductoDigital extends Producto {
 private double tamañoMB;

 public ProductoDigital(String nombre, double precio, double tamañoMB) {
     super(nombre, precio); // Enviamos datos al constructor padre
     this.tamañoMB = tamañoMB;
 }

 // Agregamos información específica del mundo digital
 @Override
 public void mostrarDescripcion() {
     System.out.println("Producto Digital: " + nombre + 
                        " | Precio: $" + precio + 
                        " | Tamaño: " + tamañoMB + " MB (Descarga inmediata)");
 }
}
