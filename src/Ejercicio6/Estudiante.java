package Ejercicio6;


public class Estudiante extends Persona {
 private String carnet;
 private String carrera;

 public Estudiante(String nombre, String carnet, String carrera) {
     super(nombre); // Pasamos el nombre al constructor del padre
     this.carnet = carnet;
     this.carrera = carrera;
 }

 //  Ampliamos la presentación con carnet y carrera
 @Override
 public void presentarse() {
     System.out.println("Hola, soy el estudiante " + nombre + 
                        ". Mi carnet es " + carnet + 
                        " y estudio " + carrera + ".");
 }
}
