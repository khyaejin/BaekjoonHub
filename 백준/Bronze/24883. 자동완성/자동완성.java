import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        if (input.equals("N") || input.equals("n")) {
            System.out.print("Naver D2");
        }
        else{
            System.out.print("Naver Whale");
        }

    }
}
