import java.util.Scanner;
import java.lang.Math;

class resolvente {
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);	
		double a, b, c;
		System.out.println("Ingrese de a:"); 
        a = entrada.nextDouble();
		System.out.println("Ingrese de b:"); 
        b = entrada.nextDouble();
		System.out.println("Ingrese de c:"); 
        c = entrada.nextDouble(); 
		System.out.println("a="+ a +" b="+ b +" c="+ c);
		double x, b2, x1, x2;
		if (a == 0)
			System.out.println("ecuacion de una recta");
		else {
			b2 = Math.pow(b,2);
			x = Math.sqrt(b2-4*a*c);
			if (x < 0)
				System.out.println("raiz imaginaria");
			else {
				x1 = -b + x;
				x2 = -b - x;
				System.out.println("x1= "+ x1);
				System.out.println("x2="+ x2);
			}
		}
	}
}