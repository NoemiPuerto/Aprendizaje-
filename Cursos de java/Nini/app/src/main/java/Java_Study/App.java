/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Java_Study;

public class App {


    /**
     * Notas:
     *  Asume que las siguientes variables estan declaradas
     *  String text;
     *  char letter;
     * 
     * 
     * - Las Strings son consideradas array de caracters
     * - La variable para un caracter es char
     * - Para conseguir el caracter en una String en cualquier posicion se usa String text[i] donde
     *   i es la posicion o el index del caracter. (Solo c++, Phyton y la mayoria) 
     * - Para Java tambien se puede usar text[i] pero no siempre funciona, es mejor usar text.charAt(i) (se creen especiales los hjdpt)
     * - Para la comparacion de un caracter se usa letter.equals()
     * - Los caracteres usan comilla singular no doble (estas -> '' no estas -> "")
     * - Para conseguir el tamaño de una String se usa el .length() como con las array ej: text.length();
     */
    

    /**
     * Funcion para cambiar texto a nini
     * Ej:
     * 
     * texto: Mimi tiene gustos muy raros
     * return: Mimi tiine gistis miy riris
     * 
     * @param texto mucho texto
     * @return el texto comvertido a nini
     */
    public static String nini(String texto){
        String nini="";
        final String NOSE="aeou";
        
        for(int i=0;i<texto.length();i++){
            for(int j=0;j<NOSE.length();j++){
                if(texto.charAt(i)==NOSE.charAt(j)){

                    nini+='i';
                }
                else if (j==3&&nini.length()<=i){
                    nini+=texto.charAt(i);
                }
            }

            
        }
        //     if(texto.charAt(i)=='a'||texto.charAt(i)=='e'||texto.charAt(i)=='o'||texto.charAt(i)=='u'){
        //         nini+='i';
        //     }
        //     else{
        //         nini+=texto.charAt(i);
        //     }
        // }
        return nini;
    }
    public static void main(String[] args) {
        System.out.println(nini("ba"));
    }
}
