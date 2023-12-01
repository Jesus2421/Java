class vector {
	public static void main (String args[]){
	double notas [] ={11.2,10.6,8.5,15.9,3.1,20.12};
	double promedio = 0;
	   for (int i=0; i<=5;i++){
		  promedio = promedio + notas[i];
		  promedio = promedio/6;		  
	   }
	   System.out.println("el promedio es:"+ promedio);
	   if (promedio>=10)
			  System.out.println("estudiante aprobado");
		  else {
			  if (promedio<10)
				  System.out.println("el estudiante no aprobo");
		  }
	}
}