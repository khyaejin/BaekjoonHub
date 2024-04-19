import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        BigInteger num1 = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);
        
        BigInteger sum = num1.add(num2);
        
        System.out.print(sum);
    }
}
