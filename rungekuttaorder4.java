public class order4 {
        public double order4(double x0, double y0, double h) {
			    double x2 = pow(x0,2), y;
		        double f=-(100/3)*(1-(y0/x2+9));
                double k1 = f.eval(x0, y0);
                double k2 = f.eval(x0 + 0.5 * h, y0 + 0.5 * h * k1);
                double k3 = f.eval(x0 + 0.5 * h, y0 + 0.5 * h * k2);
                double k4 = f.eval(x0 + h, y0 + h * k3);
				y = y0 + (h * (k1 + 2 * (k2 + k3) + k4)) / 6;
                return y;
        }
    }
public class rungekuttaorder4 {
	public static  void main (String args[]){
        double x0 = 1.4, y0 = 10, xn = 1, h=5; 
        for (int i = 0; i < 10; i++) {
            y0 = order4(x0, y0, h);
            x0 += h;
			System.out.println ("y= " + y);
        }
		System.out.println ("y= " + y);
        return y;		
    }
}