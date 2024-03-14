import java.util.Scanner;

class Min{

	private int minX = 1000;
	private int minY = 1000;
	private int finalMin = 1000;

	public int findMin(int a, int b) {
		if(a<b)
			return a;
		else
			return b;
	}
	
	public void run() {
		//입력
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();

		//계산
		minX = findMin(x, (w-x));
		minY = findMin(y, (h-y));
		finalMin = findMin(minX, minY);
		
		//출력
		System.out.print(finalMin);
	}
}

public class Main {

	public static void main(String[] args) {
		Min min = new  Min();
		min.run();
	}
}
