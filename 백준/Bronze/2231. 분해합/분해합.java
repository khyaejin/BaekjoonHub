import java.util.Scanner;

class Constructor{
	public void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = 0;

		for(int i = 0; i<N; i++) {
			int sum = 0; //각 자릿수 합
			int number = i;
			
			while(number != 0) {
				sum += number % 10; //각 자릿수 더하기
				number /= 10;
			}
			
			if(sum+i == N) {
				result = i;
				break; //for문 나가기
			}				
			
		}
		
		System.out.println(result);

		
	}
}

public class Main {
 
	public static void main(String[] args){
		Constructor constructor = new Constructor();
		constructor.run();
	}
}