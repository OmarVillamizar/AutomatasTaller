import java.util.Scanner;

public class Automata1 {
    boolean estado2;
    boolean estado3;

    boolean nombreValido(String e){// e= entrada
        boolean aceptado=false;
        int i=0;
        //ESTADO INICIAL
        if(e.charAt(0)>= 65 && e.charAt(0)<= 90 || e.charAt(0)>= 97 && e.charAt(0)<= 122){
            estado3 = true;
        } else estado2 = true;
       //ESTADO 2
        if(estado2){
            aceptado=false;
        }
        //ESTADO 3
        while(estado3 && i<e.length()){
            if(e.charAt(i) >= 65 && e.charAt(i) <= 90 || e.charAt(i) >= 97 && e.charAt(i)  <= 122 || e.charAt(i) >=48 && e.charAt(i) <= 57){
                aceptado=true;
            } else aceptado=false;
            i++;
        }
        //RETORNO FINAL
    return aceptado;
    }

    public static void main(String[] args) {
        Automata1 au1 = new Automata1();
        Scanner s = new Scanner(System.in);
        System.out.println("Porfavor ingrese un nombre para una variable");
        boolean valido = (au1.nombreValido(s.next()));
        if(valido){
            System.out.println("La entrada ingresada es un nombre de variable VALIDO.");
        } else System.out.println("ERROR entrada no válida.");
    }
}
