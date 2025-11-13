package h1;

public class H1_main {

	public static void main(String[] args) {
	
	// TODO Auto-generated method stub
	int zone = 3;
	double price;
	switch (zone){
		case 1:
		price = 2.00;
		break;
		case 2:
		price = 2.35;
		break;
		case 3:
		price = 2.35;
		break;
		case 4:
		price =  2.85;
		break;
	default:
		price = 4.0;
		break;
	}
	System.out.println("Anzahl Zonen: " + zone);
    System.out.println("Gesamtpreis: " + price + "€");
	}	
}
