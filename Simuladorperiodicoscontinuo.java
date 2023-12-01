import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
 public class Simuladorperiodicoscontinuo{
	 public static void main(String arg[ ]){
		 System.out.println ("Simulacion numero 2 de un puesto de periodicos");
		 Random n1 = new Random();
         double media = 0,varianza,desvtipica, CV, V2 = 0, suma = 0, Xi = 0, n = 0, px;
          for (int i=150;i<=200;i++){
			  n++;
			  Xi = (double) i;
			   suma = suma + Xi;
			   media = suma / n;
			   V2 = Math.pow(Xi-media, 2.0);
		  }
		  varianza = V2/n;
		  desvtipica = Math.sqrt(varianza);
		  CV = varianza/media;
		  px = media-desvtipica;
		   for (int i=150;i<=200;i++){
			  n++;
			  Xi = (double) i;
			  if (( media-desvtipica < Xi) && ( Xi <= media)) {
					 px = 0.341;
				 }
			  else if (( media < Xi) && ( Xi <= media+desvtipica)) {
					 px = 0.341;
				}
			  else if (( media-2*desvtipica < Xi) && ( Xi <= media-desvtipica)) {
					 px = 0.136;
				}
			  else if ((media+desvtipica < Xi) && ( Xi <= media+2*desvtipica)) {
					 px = 0.136;
				}
				else if (( media-3*desvtipica < Xi) && ( Xi <= media-2*desvtipica)) {
					 px = 0.21;
				}
			  else if ((media+3*desvtipica < Xi) && ( Xi <= media+2*desvtipica)) {
					 px = 0.21;
				}
				else {
					px = 0.1;
				}
         }
		  }
         }