class Convercion {
	public static void main (String args[]){
		byte a;
		int i = 258;
		double d = 330.289;
		System.out.println("conversion de int a byte");
		a = (byte) i;
		System.out.println("i = " + i + " a = "+ a);
		System.out.println("conversion de double a int");
		i = (int) d;
		System.out.println("d = " + d + " i = "+ i);
		System.out.println("conversion de int a double");
		d = (double) i;
		System.out.println("i = " + i + " d = "+ d);
		System.out.println("conversion de double a byte");
		a = (byte) d;
		System.out.println("d = " + d + " a = "+ a);
	}
}