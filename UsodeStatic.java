class PruebaStatic {
	private static int x = 3;
	private static int y;
	public PruebaStatic (){
		System.out.println("llamada al constructor");
	}
	public static void getx() {
		System.out.println("x="+ x);
		gety();
	}
	public static void gety() {
		System.out.println("y="+ y);
	}
	static {
		System.out.println("Se ejecutara el bloque static");
		y = x *3;
	}
}
class UsodeStatic {
	public static void main(String args[]){
		PruebaStatic PS = new PruebaStatic ();
		PruebaStatic.getx();
	}
}