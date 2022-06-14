package proyecto.classes;

public class Calculadora {
    
    public int Suma(int numero1, int numero2){
        return numero1 + numero2;
    }

    public int Resta(int numero1, int numero2){
        return numero1 - numero2;
    }
    
    public int Por(int numero1, int numero2){
        return numero1 * numero2;
    }

    public int Div(int numero1, int numero2){
        return numero1 / numero2;
    }
    public int Sumarvalores(int... valores){
        int sumota=0;
        for(int i=0;i<valores.length;i++){  
            sumota+=valores[i];
         } 
         return sumota;
    }
    public int Restavalores(int... valores){
        int restota=valores[0];
        for(int i=1;i<valores.length;i++){  
            restota-=valores[i];
            // if (i==0) restota=valores[i];
            // else {
            //     restota-=valores[i];
            // }

         } 
         return restota;
    }

    public int Mulvalores(int... valores){
        int Mul=1;
        for(int i=0;i<valores.length;i++){  
            Mul*=valores[i];
         } 
         return Mul;
    }

    public int Divvalores(int... valores){
        int Divi=valores[0];
        for(int i=1;i<valores.length;i++){  
        //     if (i==0) Divi=valores[i];
        //     else {
                Divi/=valores[i];
        //  } 
        }
         return Divi;
    }
}
