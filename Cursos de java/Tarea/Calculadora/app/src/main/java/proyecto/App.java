/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package proyecto;

import proyecto.classes.Calculadora;
// import proyecto.classes.Resta;
// import proyecto.classes.Suma;

public class App {
  
    //  public static void Sumarvalores(int... valores){
         
        // Index/Posicion: [0,1,2,3,4]
        // Set de valores: [9,8,7,6,5]
        // Se usa lo brackets [] y dentro la posicion
        // EJ: Array [Posicion]
        // Array.length regresa el tamaño del array

            // int sumota=0;
            // for (int x:valores) sumota+=x
        // for(int i=0;i<valores.length;i++){  
        //     sumota+=valores[i];                          //for(inicializacion: condicion; agregacion)
        //  } 
        //  System.out.println("suma: "+sumota);
            
        // System.out.println("\n\nCon encharced for loop");
        // for (int val:valores){                   //for(inicializacion : Array) Tambien funciona con colecciones
        //     System.out.println("valor :" + val);            //La inicializacion tendra que ser del mismo tipo que el array
                                                  //La inicializacion tendra el valor no la posicion
                                                 //no se puede acceder a la posicion


        //  }
    // }


    //calculadora 2
    // int nums[]={1,2,3,4,5};
    // int sum=0;
    
    //     for (int x: nums) sum+=x;



    public static void main(String[] args) {


        //dando valores
    //     for (int i=0; i <2 ; i++)
    //         for (int j=0; j<3; j++)
    //             nums=(i+1)*(j+1);

    //     //uso de for-each para mostrar la suma total
    //     for (int x[]:nums){
    //         for (int y:x){
    //             System.out.println("Valor de: "+y);
    //             sum+=y;
    //         }
    //     }
    //     System.out.println("Suma total: "+sum);

    // }

    // Sumarvalores(1,2,3,4,5,6);
        //  int i=0;
        //  System.out.println(i++);   //i+=1
        //  System.out.println(++i);   //1+=i

        //Suma y resta
    //    Suma suma = new Suma(10,5);

    //    System.out.println("sumita: "+suma.sumita());
        
    //    Resta resta = new Resta(10);
    //    resta.numero2(5);
    //    System.out.print("resta: "+resta.getNumero1());

    Calculadora calculadora = new Calculadora();
    int sumota=calculadora.Sumarvalores(1,2,3,4,5,6);
    System.out.println("suma: "+sumota);

    int restita=calculadora.Restavalores(16,5,1);
    System.out.println("resta: " +restita);

    int multi=calculadora.Mulvalores(2,5,3);
    System.out.println("multiplicación: " +multi);

    int entre=calculadora.Divvalores(12,3,2);
    System.out.println("Divición: " +entre);


    // System.out.println("suma: "+calculadora.Resta(10,5));
    }
}

