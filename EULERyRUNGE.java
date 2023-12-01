package euleryrunge;
import java.text.DecimalFormat;
import java.util.Scanner;

public class EULERyRUNGE {

  static Scanner entrada;
  static DecimalFormat decimales = new DecimalFormat("0.0000");
  
  static double funcion(double x, double w) 
  {
        double z;
        z = 1 / (Math.pow(x, 2)) - (w/x) - (Math.pow(w, 2));
        return z;
  }
  
    public static void main(String[] args) {
       entrada = new Scanner(System.in);

       byte opcion;
       System.out.println("==================================================");  
       System.out.println(" RESOLUCION DE UNA FUNCION POR METODOS NUMERICOS");
       System.out.println("==================================================");
         
       menu();
    
       opcion = entrada.nextByte();
         
       switch(opcion)
       {
             case 1:
             {
                 euler();
                 break;
             }
             
             case 2:
             {
                 rungekutta();
                 break;
             }
             
             case 3:
             {
                 predictor();
                 break;
             }             
       
             case 4:
             {
                 System.out.println("HA SALIDO DEL PROGRAMA");
                 break;
             }
        }   //menu
   }   //main del programa
    
   static void menu()
   {
       System.out.println("                  ELIGA UNA OPCION");
       System.out.println("-------------------------------------------------");
       System.out.println("            1)Metodo de Euler");
       System.out.println("            2)Metodo Runge-kutta");
       System.out.println("            3)Metodo Predictor-Corrector");
       System.out.println("            4)Salir");
       System.out.println("-------------------------------------------------");
   }
   
   static void euler()
   {
       int i,iteracion;
       double h=0.05;
       double t;
       double yi;
       double yo;
    
         System.out.println("           //////////////////");
         System.out.println("           *METODO DE EULER*");
         System.out.println("          //////////////////");
         
         System.out.println("ingresa el valor de t");
         t = entrada.nextDouble();
         
         System.out.println("ingresa el valor de la condicion inicial");
         yi = entrada.nextDouble();
        
         System.out.println("ingresa la cantidad de iteraciones que desea ver");
         iteracion = entrada.nextInt();
      
         System.out.println("i  |   t   | Y n+1  |");  
         System.out.println("--------------------");
         
         for (i = 1;i <= iteracion; i++)
         {
           yo= yi+ h * ((1 / (Math.pow(t, 2))) - (yi/t) - (Math.pow(yi, 2)));
           yi = yo;
             
           System.out.print((i)+"  |");
           System.out.print(decimales.format(t)+" |");
           System.out.println(" "+decimales.format(yi)+"|");
           System.out.println("--------------------");
             
           t = t + h;
         }      
   } //fin euler
   
   static void rungekutta()
   {     
       System.out.println("  /////////////////////////");
       System.out.println("   *METODO DE RUNGE-KUTTA* ");
       System.out.println("  /////////////////////////");
       
       int i,iteracion;
       double h=0.05;
       double y,t,w,yn;  
       double k1,k2,k3,k4,K2,K3,K4,T,T4;
         
         System.out.println("ingresa el valor de t");
         t = entrada.nextDouble();

         System.out.println("ingresa el valor de la condicion inicial");
         y = entrada.nextDouble();
         
         System.out.println("ingresa la cantidad de iteraciones que desea ver");
         iteracion = entrada.nextInt();

         yn = y;
         System.out.println();
            
         for (i = 1;i <= iteracion; i++)
         {
            k1 =  h * (funcion(t,yn));
            T = (t + 0.5 * h);
            
            k2 = (yn + 0.5 * k1);
            K2 = h  * (funcion(T,k2));
            
            k3 = (yn + 0.5 * K2);
            K3 = h * (funcion(T,k3));
            
            T4 = t + h;
            k4 = (yn + K3);
            K4 = h * (funcion(T4,k4));
                    
            w = yn + (k1 + (2 * K2) + (2 * K3) + K4)/6;
            yn = w;
            
            System.out.println("  i="+i+" t="+t);
            System.out.println("=============");
            System.out.println("k1 = "+decimales.format(k1));
            System.out.println("k2 = "+decimales.format(K2));
            System.out.println("k3 = "+decimales.format(K3));
            System.out.println("k4 = "+decimales.format(K4));
            System.out.println("T"+i+" = "+t);
            System.out.println("y"+(i+1)+" = "+decimales.format(yn));
            System.out.println("=============");
            System.out.println("");
            
            t = t + h;
        }
   } //fin rungekutta
   
   static void predictor()
   {
       double yn = -1,tn = 1;
       double yi = -1,ti = 1;
       double h=0.05;
       double w;
       int I=0;
       int i,Predictor,Corrector;
        
       System.out.println("ingresa el numero de iteraciones de predictor");
       Predictor = entrada.nextByte();
        
       System.out.println("ingresa el numero de iteraciones de corrector");
       Corrector = entrada.nextByte();
        
       System.out.println();
       // PREDICTOR
       
       System.out.println("======================");
       for (i = 1; i <= Predictor; i++)
       {
          
          w = yn + h * (funcion(ti,yi));
          System.out.println("Predictor("+i+") = "+decimales.format(w));
          yn = w;
            
            tn = tn + h;// antes de entrar al ciclo while se incrementa tn, para satifacer la funcion...
                        // ... f(Tn+1,Yn +1)
           // CORRECTOR
           
          do
          {
             I =  (I + 1);// para cuando sea igual al ultimo iteracion saque el valor y pueda usarse en...
                               //... en la proxima iteracion del while
               /*System.out.println("tn "+tn+" yn"+yn);
               
                 System.out.println(ti+" "+yi);
               */
             yn = yi + (h/2) * ( funcion(ti,yi) + funcion(tn,yn) );
                 
             if (I <= Corrector) 
             {
               System.out.println("Corrector("+I+") = "+decimales.format(yn));
                   
               if (I == Corrector)
               {
                 yi = yn;//es asignado el ultimo valor de corrector   
               }
                    
             }// fin if principal
               
          }while (I <= Corrector);
          
          I = 0;
          yn = yi;// cuando se repita el segundo ciclo se use arriba el valor de p para yn
       
          System.out.println();
          ti = ti + h;// cuando sale del ciclo while ti se incrementa
         System.out.println("======================");
        }// fin  for
       
    }// fin predictor corrector
} //PRINCIPAL