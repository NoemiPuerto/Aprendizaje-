/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package clases;

import clases.Animales.mascota;

public class App {
    
    

    public static void main(String[] args) {
        mascota mascota = new mascota("himan", "perro", 5);

        persona persona1 = new persona();
        persona persona2 = new persona("marco", (short)48);
        persona persona3 = new persona("Agripino", (short)58, "rem", 60, 180, mascota);

        mascota.hablar();

        // persona3.setEdad((short)48);

        // System.out.println(persona3);
        // System.out.println(persona2);

        trabajador trabajador = new trabajador("fernando",(short)30,"Ram",80,180,mascota,"Hoyoverse",2,2);
        System.out.println(trabajador);
        
}
}

