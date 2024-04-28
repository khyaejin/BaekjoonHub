import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String doctorAhh = sc.next();
        String jaewhanAhh = sc.next();

        if (doctorAhh.length() >= jaewhanAhh.length()) {
            System.out.print("go");
        }
        else{
            System.out.print("no");
        }
    }
}
