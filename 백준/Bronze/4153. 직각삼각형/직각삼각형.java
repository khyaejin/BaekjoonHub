import java.util.Scanner;

class RightTriangle {

	public void run() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			
			//000입력시 종료
			if(x == 0 && y == 0 && z == 0) break; 
			
            if(x * x + y * y == z * z || y * y + z * z == x * x || z * z + x * x == y * y) {
            	System.out.println("right");
            } else {
            	System.out.println("wrong");
            }			
		}
	}
}	


public class Main {

    public static void main(String[] args) {
    	RightTriangle rightTriangle = new RightTriangle();
    	rightTriangle.run();
    }
}