import java.util.Scanner;

class Plus {
	public void run() {
		Scanner sc = new Scanner(System.in);
		int loof = sc.nextInt();
		int [] results = new int [loof];
		
		for(int i = 0; i<loof; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			results[i] = a + b;
		}
		
		for(int i = 0; i<loof; i++) {
			System.out.println(results[i]);
		}
	}
}


public class Main {

    public static void main(String[] args) {
    	Plus plus = new Plus();
    	plus.run();
    }
}
