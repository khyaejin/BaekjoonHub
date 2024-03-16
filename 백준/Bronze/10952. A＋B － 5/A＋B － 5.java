import java.util.Scanner;

class Plus {
	public void run() {
		Scanner sc = new Scanner(System.in);
		
		int [] results = new int [100];
		int count = 0;

		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if((a==0) && (b==0)) break; // a,b 둘 다 0일시 종료
			
			results[count] = a + b;
			count++;
		}
		
		int num = 0;
		for(int i = 0; i < count; i++) {
			System.out.println(results[num]);
			num++;
		}
	}
}


public class Main {

    public static void main(String[] args) {
    	Plus plus = new Plus();
    	plus.run();
    }
}
