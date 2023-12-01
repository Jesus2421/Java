import java.util.Scanner; 
public class entradaporteclado {
    public static void main (String [ ] args) {
        System.out.println ("Por favor introduzca un numero por teclado:");
        String x = "";
        Scanner entradaEscaner = new Scanner (System.in);
        x = entradaEscaner.nextLine (); 
        System.out.println ("Entrada recibida por teclado es: \"" + Float.parseFloat(x) +"\"");
    } 
} 