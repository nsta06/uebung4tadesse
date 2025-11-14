package h2;

public class H2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 10;
		boolean x,y,a,b,c;
		x = false;
		y = false;
		if (input == 10) {
			x = true;
			y = false;
		} else if (input == 11) {
			x = true;
			y = true;
		}
		else if ( input == 1) {
			x = false;
			y = true;
		} else {
			x = false;
			y = false;
		}
		a = (x && y);
		b = (x ||(x!=y));
		c = (!y);
		System.out.println("Input: " + input);
        System.out.println("-----");
        System.out.println("x ist: " + x); 
        System.out.println("y ist: " + y);
        System.out.println("a ist: " + a);
        System.out.println("b ist: " + b); 
        System.out.println("c ist: " + c); 
		
		
	}
}