import java.util.Scanner;
import java.io.IOException;
import java.math.BigInteger;
 
class Calculator{
	public void run(){
		Scanner sc = new Scanner(System.in);
		
		BigInteger money = new BigInteger(sc.next());
		BigInteger organism = new BigInteger(sc.next());
		
		BigInteger[] result = money.divideAndRemainder(organism);
		System.out.println(result[0]); //몫
		System.out.println(result[1]); //니머지;

		
		sc.close();			
	}
}

public class Main {
 
	public static void main(String[] args) throws IOException {
		Calculator calculator = new Calculator();
		calculator.run();
	}
}