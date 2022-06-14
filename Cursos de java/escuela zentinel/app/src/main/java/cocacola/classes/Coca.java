package cocacola.classes;

public class Coca extends Lata {

    private int cantidad;

    public Coca(int height, int length, int width, int cantidad) {
        super(height, length, width);
        this.cantidad = cantidad;
    }
    
    public void beber (int bebido){
        cantidad -= bebido;         //cantidad = cantidad - bebido
    }
    public void llenar (int añadir){
        cantidad = cantidad + añadir;  //cantidad += añadir
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void test(){
        height = 50;
    }
}
