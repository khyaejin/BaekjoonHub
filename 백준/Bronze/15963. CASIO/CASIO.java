import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();

        if (A.equals(B)) {
            System.out.print("1");
        }
        else{
            System.out.print("0");
        }

    }
}
