package clases;

import clases.Animales.mascota;

public class persona {
    private String nombre; //String texto
    private short edad; 
    private String waifu;
    private double peso;
    private double medida;
    private mascota mascota;

    //public    - todos lo pueden ver
    //protected - accesible solo en la clase y en las clases hijos
    //private   - accesible solo se ve dentro de la clase 
    //(default no se escribe nada) - visible dentro de la clase y dentro de la carpeta (package) en la que la clase esta 

    public persona(){
       this("",(short) 0, "", 0, 0, new mascota()); 
    }

    public persona(String nombre, short edad, String waifu, double peso, double medida, mascota mascota){
        this.nombre=nombre;
        this.edad=edad;
        this.waifu=waifu;
        this.peso=peso;
        this.medida=medida;
        this.mascota=mascota;
    }

    public persona(String nombre, short edad){
        //otra forma (siempre tiene que ser en la primera linea de la funcion)
        this(nombre,edad,"",0,0, new mascota()); //llama la funcion de arriba

        //una manera (solo inicia las que quieres)
        // this.nombre=nombre;
        // this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    public String getWaifu() {
        return waifu;
    }

    public void setWaifu(String waifu) {
        this.waifu = waifu;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getMedida() {
        return medida;
    }

    public void setMedida(double medida) {
        this.medida = medida;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+
                "\nEdad: "+edad+
                "\nWaifu: "+waifu+
                "\nPeso: "+peso+"kg"+
                "\nMedida: "+medida+"cm"+
                "\nMascota: "+mascota;
    }

    

}
