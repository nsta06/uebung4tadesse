package h2;

public class H2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 20;
		boolean x,y,a,b,c;
		
		x = (input == 10 || input == 11);
		y = ( input == 11 || input == 1);
		
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
