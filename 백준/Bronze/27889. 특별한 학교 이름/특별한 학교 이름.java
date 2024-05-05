import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String shortNAme = sc.next();

        if (shortNAme.equals("NLCS")) {
            System.out.println("North London Collegiate School");
        }
        else if (shortNAme.equals("BHA")) {
            System.out.println("Branksome Hall Asia");
        }
        else if (shortNAme.equals("KIS")) {
            System.out.println("Korea International School");
        }
        else if (shortNAme.equals("SJA")) {
            System.out.println("St. Johnsbury Academy");
        }

    }
}
