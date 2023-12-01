import java.util.Random;
import java.util.Scanner;
    public class Simuladorperiodicosdiscreto {
        public static void main(String arg[ ]) {
			System.out.println ("Simulacion numero 1 de un pusto de periodicos");
			  int dia;
			  Scanner entrada = new Scanner(System.in); 
		      System.out.println("Cuantos dias decea simular:"); 
              dia = entrada.nextInt();
			 Random y = new Random();
			double media = 0,varianza,desvtipica, CV, V2 = 0,Xi = 0, suma = 0, frecu = 0, N = 0;
			System.out.println("simulacion de ventas diarias");
			for (int i = 1; i<=dia;i++){
			     if ((0 <= (y.nextDouble() * 1 + 0)) && ((y.nextDouble() * 1 + 0) < 0.1)) {
					 Xi = 150;
					 frecu++;
					 System.out.println(" las ventas fueron de= "+ Xi);
				 }
			     else if ((0.1 < (y.nextDouble() * 1 + 0)) && ((y.nextDouble() * 1 + 0) < 0.35)) {
		              Xi = 160;
					  frecu++;
					 System.out.println(" las ventas fueron de= "+  Xi);
				 }
			     else if ((0.35 < (y.nextDouble() * 1 + 0)) && ((y.nextDouble() * 1 + 0) < 0.5)) {
					   Xi = 170;
					   frecu++;
					 System.out.println(" las ventas fueron de= "+  Xi);
				 }
			     else if ((0.5 < (y.nextDouble() * 1 + 0)) && ((y.nextDouble() * 1 + 0) < 0.65)) {
					   Xi = 180;
					   frecu++;
					 System.out.println(" las ventas fueron de= "+ Xi);
				 }		         
			     else if ((0.65 < (y.nextDouble() * 1 + 0)) && ((y.nextDouble() * 1 + 0) < 0.9)) {
					  Xi = 190;
					  frecu++;
					 System.out.println(" las ventas fueron de= "+Xi);
			     }
			     else if ((0.9 < (y.nextDouble() * 1 + 0)) && ((y.nextDouble() * 1 + 0)< 1)) {
					   Xi = 200;
					   frecu++;
					 System.out.println(" las ventas fueron de= "+  Xi);
			     }
				 N = N+frecu;
				 suma = suma + Xi*frecu;
				 media = suma / N;
				 V2 = Math.pow(Xi-media, 2.0);
         }
		 System.out.println("el vendedor deberia comprar diariamente: "+ media + " periodicos");      
		  varianza = V2/dia;
		  desvtipica = Math.sqrt(varianza);
		  CV = varianza/media;
          System.out.println("Varianza: "+ varianza);
 		  System.out.println("desvtipica: "+ desvtipica);
		  System.out.println("Coeficiente de variacion: "+ CV);
		  }
}

	