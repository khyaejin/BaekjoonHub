import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int before = 0;
		int current = scan.nextInt();
		int sum = 0;
		int result = 0;
		
		for(int i=1; i<N; i++) {
			before = current;
			current = scan.nextInt();
			if(current - before > 0) 	// 증가
				sum += current - before;
			else {
				result = Math.max(result, sum);
				sum = 0;
			}
		}
		result = Math.max(result, sum);

		System.out.println(result);
		scan.close();
	}

}