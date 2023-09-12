import java.util.Scanner;

public class Automata2 {
    boolean estado2,estado3,estado4,estado5,estado6,estado7;

    boolean numeroReal(String e){
        boolean aceptado = false;
        int i=0;
        //ESTADO INICIAL
        if(e.charAt(i) >=48 && e.charAt(i) <= 57){
            estado2 = true;
            i++;
        } else return aceptado = false;
        //ESTADO DOS
        while(estado2 && i<e.length()) {
            if (e.charAt(i) >=48 && e.charAt(i) <= 57) {
                estado2 = true;
            } else if (e.charAt(i) =='.'){
                estado3 = true;
                estado2 = false;
            } else if (e.charAt(i) =='E'){
                estado5 = true;
                estado2 = false;
            } else return aceptado = false;
            i++;
        }
        //Si no se ingreso "E" o ".", error.
        if(!estado3 && !estado5){
            return aceptado=false;
        }
        //ESTADO 3
        if(estado3) {
            if (e.charAt(i) >= 48 && e.charAt(i) <= 57) {
                estado4 = true;
            } else return aceptado = false;
            i++;
        }
        //ESTADO 4
        while(estado4 && i<e.length()) {
            if (e.charAt(i) >=48 && e.charAt(i) <= 57) {
                estado4 = true;
                aceptado = true;
            } else if (e.charAt(i)=='E'){
                estado5 = true;
                estado4 = false;
            } else return aceptado = false;
            i++;
            }
        //ESTADO 5
        if(estado5){
            if ((e.charAt(i)== '-' || (e.charAt(i) == '+'))) {
                estado6 = true;
                estado5 = false;
            } else if (e.charAt(i) >=48 && e.charAt(i) <= 57) {
                estado7=true;
                estado5=false;
            } else return aceptado = false;
            i++;
        }
        //ESTADO 6
        if(estado6){
            if (e.charAt(i) >=48 && e.charAt(i) <= 57){
                estado7 = true;
                estado6 = false;
            } else return aceptado = false;
            i++;
        }
        //ESTADO 7
        while(estado7 && i<e.length()){
            if (e.charAt(i) >=48 && e.charAt(i) <= 57){
                estado7 = true;
                aceptado = true;
            } else return aceptado = false;
            i++;
        }
        //Si la cadena finalizo correctamente en algún estado de aceptación
        if(estado7 && e.length()==i || estado4 && e.length()==i){
            aceptado=true;
        }
        
        return aceptado;
    }

    public static void main(String[] args) {
        Automata2 au2 = new Automata2();
        Scanner s = new Scanner(System.in);
        System.out.println("Porfavor ingrese un número real");
        boolean valido = (au2.numeroReal(s.next()));
        if(valido){
            System.out.println("La entrada ingresada es un número real VALIDO.");
        } else System.out.println("ERROR entrada no válida.");
    }
}
