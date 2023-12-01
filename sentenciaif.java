class sentenciaif {
      public static void main (String args[]){
	     int i = 9;
		 if (i % 2 == 0) // no tiene llaves por tener una sola instruccion 
		     System.out.println("el numero:"+ i +" es par");
	     else{
			 System.out.println("el numero:"+ i +" es impar");
			 if (i % 3 == 0)
				 System.out.println("el numero:"+ i +" es multiplo de 3");		 
		 }			 
      }
}