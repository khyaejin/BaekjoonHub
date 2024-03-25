import java.util.Scanner;
import java.io.IOException;
import java.math.BigInteger;
 
class GCDLCM{
	public void run(){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();

		int gcd = gcd(a, b); //최대공약수 판별
		int lcm = (a*b) / gcd; //최소공배수 판별
		
		System.out.println(gcd); //최대공약수 출력
		System.out.println(lcm); //최소공배수 출력
		
		sc.close();			
	}
	
	public int gcd(int a, int b) {
		
		while(b !=0) {
			int temp = b;
			b = a%b;
			a = temp;
		}
		return a;
	}
	
}

public class Main {
 
	public static void main(String[] args) throws IOException {
		GCDLCM math = new GCDLCM();
		math.run();
	}
}