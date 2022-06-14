package clases.Animales;

public class mascota {
private String nombre;
private String especie; 
private int edad;

public mascota(){
    this("","",0);
}

public mascota(String nombre, String especie, int edad) {
    this.nombre = nombre;
    this.especie = especie;
    this.edad = edad;
}

public void hablar(){
    System.out.println("(habla)");
}

public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getEspecie() {
    return especie;
}
public void setEspecie(String especie) {
    this.especie = especie;
}
public int getEdad() {
    return edad;
}
public void setEdad(int edad) {
    this.edad = edad;
}

@Override
public String toString() {
    return "Nombre: "+nombre+
            "\nEspecie: "+especie+
            "\nEdad: "+edad;
}



}
