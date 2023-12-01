class rectangulo {
	double base;
    double altura;
	rectangulo(double x, double y){ //el metodo construtor
		base = x;
        altura = y;		
	}
	double area (){
		double resultado;
		resultado = base * altura;
		return (resultado);
	}
	void mostarbase (){
		System.out.println("la base es: "+ base);
	}
	void mostaraltura (){
		System.out.println("la altura es: "+ altura);
	}
}
class arearectangulo {
	public static  void main (String args[]){
		rectangulo rec_1;
		rectangulo rec_2;
		rec_1 = new rectangulo(10.1,2.5);
		rec_2 = new rectangulo(4.3,3.9);
		System.out.println("rectangulo 1");
        rec_1.mostarbase();
        rec_1.mostaraltura();
        System.out.println("el area es: "+ rec_1.area());
		System.out.println("rectangulo 2");
		rec_2.mostarbase();
        rec_2.mostaraltura();
        System.out.println("el area es: "+ rec_2.area());
	}
}