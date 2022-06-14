package cocacola.classes;

public class Persona {
    private String nombre;
    private Coca coca;
   

    public Persona(String nombre, Coca coca) {
        this.nombre = nombre;
        this.coca = coca;
    }



    public Coca getCoca() {
        return coca;
    }



    public void setCoca(Coca coca) {
        this.coca = coca;
    }



    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public void beber (int cantidad){
        coca.beber(cantidad);
    }

    public void llenar(int cantidad){
        coca.llenar(cantidad);
    }

    public void ImprimirCoca(){
        System.out.println("Coca de: "+nombre);
        System.out.println("Height: "+coca.getHeight());
        System.out.println("Length: "+coca.getLength());
        System.out.println("Width: "+coca.getWidth());
        System.out.println("Cantidad: "+coca.getCantidad());
    }
}
