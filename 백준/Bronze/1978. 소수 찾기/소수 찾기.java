import java.util.Scanner;

class PrimeNumber {
	private int number;

	public void run() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int numOfPrimeNum = 0;
		
		for(int i =0; i<num; i++) {
			number = sc.nextInt();		
			
			if(determinePrimeNum()) {
				numOfPrimeNum++;
			}
		}
		System.out.println(numOfPrimeNum);
	}
		private boolean determinePrimeNum(){
			if(number == 1) return false; //1은 소수아님
			
			for(int i = 2; i<number; i++) {
				if(number % i == 0) { //1과 자신 자기 외의 수로 나누어 떨어지면 소수아님
					return false;
				}
			}
			return true;
		}
}


public class Main {

    public static void main(String[] args) {
    	PrimeNumber primeNumber = new PrimeNumber();
    	primeNumber.run();
    }
}
