import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
        Date today = new Date();
        int year = today.getYear() + 1900;
        int month = today.getMonth() + 1;
        int date = today.getDate();

        System.out.println(year);
        System.out.println(month);
        System.out.println(date);


    }
}
