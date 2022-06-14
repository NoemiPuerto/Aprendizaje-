package Calculadora;



public class Calculadora {
    /*
     * Intenta hacer todas estas funciones sin ver las notas o buscar en internet
     * esto es mas para ayudarte con la practica
     * no te preocupes por los double todo el proceso deberia de ser igual
     * solo que esta vez vas a usar mayormente double no int
     * recuerda que los double son numeros que tienen decimal
     * *****************************************************************************************
     * ***************        NO USES DOUBLES PARA DECLARAR i EN FOR LOOPS          ************
     * *************** NO USES LOS == o != PARA COMPARAR SI DOS VALORES SON IGUALES ************
     * *****************************************************************************************
     * Las computadoras no pueden comparar valores decimales con completa precioson
     * Es preferible que uses los simbolos < o > para comparar decimales
     * Es preferible que i en for(int i=0...) siempre sea int o long pero nunca algo que use decimales 
     * 
     * 
     * No creo que los necesites usar pero de todas formas lo digo por si acaso
     * 
     * 
     * 
     */

    /**
     * != //no es igual a
     * == //igual a
     * < //menor que
     * > //mayor que
     * >= //mayor e igual que
     * <= //menor e igual que
     * ! //no
     * || //o
     * && //y
     * array.length //tamaño del array
     * 
     * Para hacer un for loop de una array la mayor parte del tiempo sigue esta
     * regla
     * for(int i=0;i<array.length;i++)
     * o si quieres ir del final de la array al principio
     * for(int i=array.length-1;i>=0;i--)
     * cuidado con este ultimo, recueda las arrays empiezan desde 0 asi que
     * por eso es i>=0 y i=array.length-1
     * 
     */

    // Suma todos los valores
    public double Suma(double... array) {
        double sumota=0;
        for(int i=0;i<array.length;i++){  
            sumota+=array[i];
         } 
         return sumota;
    }

    // Resta todos los valores de la base
    // ex:
    // base=100
    // valores = {1,2,3,4,5,6,7}
    // resta = 100-1-2-3-4-5-6-7

    public double Resta(double base, double... valores) {
        double restota= base;
        for(int i=0;i<valores.length;i++){  
            restota-=valores[i];
        }
        return restota; // Recueda cambiar esto
    }

    // Multiplica todos los valores de la base
    // ex:
    // base=100
    // valores = {1,2,3,4,5,6,7}
    // Multiplicacion = 100*1*2*3*4*5*6*7
    public double Mul(double base, double... valores) {
        double por= base;
        for(int i=0;i<valores.length;i++){  
            por*=valores[i];
        }
        return por; // Recueda cambiar esto
    }

    // Divide todos los valores de la base
    // ex:
    // base=100
    // valores = {1,2,3,4,5,6,7}
    // Division = 100/1/2/3/4/5/6/7
    public double Div(double base, double... valores) {
        double divi= base;
        for(int i=0;i<valores.length;i++){  
            divi/=valores[i];
        }
        return divi; // Recueda cambiar esto
    }
   // Encuentra el maximo de una array y regresa el valor
   public double Max(double... array) {
    double max=array[0];
    for (int i=1;i<array.length;i++){      
        if (max<array[i]){
            max=array[i];
        }
    }
    return max; // Recueda cambiar esto
}

// Encuentra el minimo de una array y regresa el valor
public double Min(double... array) {
    double min=array[0];
    for (int i=0;i<array.length;i++){
        // min=((min>array[i])?array[i]:min);
        if(min>array[i]){
            min=array[i];
        }
        // este else buguea y no se por que XD
        // else{
        //     min=Min(array);
        // }
    }
    return min; // Recueda cambiar esto
}

// Saca el Average (Promedio suma total/array.length)
public double Avg(double... array) {
    double promedio=Suma(array);
    promedio/=array.length;
    return promedio; // Recueda cambiar esto
}

// Ordenar la array dependiendo de la variable asc
// asc=falso -> mayor a menor
// asc=verdad -> menor a mayor
public double[] Ordenar(boolean asc, double... array) {
    double[] ordenplis = new double[array.length];
    for (int i=0;i<array.length;i++){
        ordenplis[i] = array[i];
    }
    for (int i=0;i<ordenplis.length-1;i++){
        for (int j=i+1;j<ordenplis.length;j++){
            if(!asc&&ordenplis[i]<ordenplis[j]){
                double help = ordenplis[i];
                ordenplis[i]=ordenplis[j];
                ordenplis[j]=help;
            }
            else if(asc&&ordenplis[i]>ordenplis[j]){
                double help = ordenplis[i];
                ordenplis[i]=ordenplis[j];
                ordenplis[j]=help;
            }
        }
    }
    return ordenplis; // Recueda cambiar esto

}

// Invertir la array
public double[] Invertir(double... array) {
    double[] inverter = new double [array.length];
    for (int i=0,j=array.length-1;i<array.length;i++,j--){
        inverter[i]=array[j];
    }
    return inverter; // Recueda cambiar esto
}
/**
     * Busca un valor en una array de valores
      * @param buscar valor para buscar
     * @param valores array of ints
     * @return posicion donde el valor se encuentra 
     * Si el valor no existe regresa -1
     */
    public int findVal(int buscar,int... array){
        for (int i=0;i<array.length;i++){
           if(buscar==array[i]){
               return i;
           }
        }
        return -1;
    }

    /**
/**
     * 
     * @param base numero inicial para multiplicarse
     * @param nfinal numero final a terminar
     * @return regresa una array con los valores de la base multiplicada del 1 - 10
     * 
     * ex 1:
     *  base: 5
     *  nfinal: 10
     * 
     *  return: {5,10,15,20,25,30,35,40,45,50}      5x1,5x2,5x3,5x4,5x5,5x6,5x7,5x8,5x9,5x10
     * ex 2:
     *  base: 3
     *  nfinal: 9
     *  return: {3,6,9,12,15,18,21,24,27}           3x1,3x2,3x3,3x4,3x5,3x6,3x7,3x8,3x9
     */
    public int[] Multiples(int base,int nfinal){
        int[] jaja=new int [nfinal];
        for (int i=0,x=1;i<jaja.length;i++,x++){
            jaja[i]=base*x;
        }
        return jaja;
    }

     /**
     * Corta y regresa una porcion de la array
     * @param start principio para cortar
     * @param end   final de la cortada
     * @param valores array inicial
     * @return      un array nuevo que contiene una seccion de una array antigua
     * 
     * start:   3
     * end:     8
     * valores: {1,2,3,4,5,6,7,8,9,10}
     * 
     * return:  {4,5,6,7,8,9}
     */
    public int[] cutArray(int start, int end, int... valores){
        int[] cut = new int [end-start+1];
        for(int i=0,j=start;j<=end;i++,j++){
            cut[i]=valores[j];

        }
        return cut;
    }
    }
