package clases;

import clases.Animales.mascota;

public class trabajador extends persona {
    private String trabajo;
    private double salario;
    private int exp;

    public trabajador(){
        this("",(short) 0,"",0,0,new mascota(),"",0,0);
    }
    
    

    public trabajador(String nombre, short edad, String waifu, double peso, double medida,
            clases.Animales.mascota mascota, String trabajo, double salario, int exp) {
        super(nombre, edad, waifu, peso, medida, mascota);
        this.trabajo = trabajo;
        this.salario = salario;
        this.exp = exp;
    }



    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nTrabajo :"+trabajo+
                "\nSalario :"+salario+
                "\nExperiencia :"+exp+"años";
    }
    
    
}
