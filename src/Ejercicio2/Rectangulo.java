package Ejercicio2;

public class Rectangulo extends Figura {
 private double base;
 private double altura;

 // Constructor para inicializar los valores
 public Rectangulo(double base, double altura) {
     this.base = base;
     this.altura = altura;
 }

 // Calculamos el área específica del rectángulo
 @Override
 public double area() {
     return base * altura;
 }
}