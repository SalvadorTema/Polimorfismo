package Ejercicio1;

//Se aplica herencia usando la palabra 'extends'
public class Perro extends Animal {

 // Se sobre escribe el método de la clase base
 @Override
 public void hacerSonido() {
     System.out.println("El perro ladra: ¡Guau! ¡Guau!");
 }
}
