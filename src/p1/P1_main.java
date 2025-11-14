package p1;

public class P1_main {
    public static void main(String[] args) {
        int stockwerk = 2;

        switch (stockwerk) {
            case 0:
                System.out.println("Angebote");
                break;
            case 1:
            System.out.println("Damenkleidung");
            break;
            case 2:
            System.out.println("Herrenkleidung");
            break;
            case 3:
            System.out.println("Kinderkleidung");
            break;
            case -1:
            System.out.println("Parkhaus");
            break;
            default: 
            System.out.println("unbekant");
                break;
        }
    }
}
