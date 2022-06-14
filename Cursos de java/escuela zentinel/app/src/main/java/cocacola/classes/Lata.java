package cocacola.classes;

public class Lata {
    protected int height;
    private int length;
    private int width;

    public int volumen (){
        return height*length*width;
    }
    public Lata(int height, int length, int width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }
    


    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
}
