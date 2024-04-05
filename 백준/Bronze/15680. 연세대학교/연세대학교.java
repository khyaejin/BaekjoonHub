import java.util.Scanner;

//class Chessborad{
//	
//	public void run() {
//	    Scanner sc = new Scanner(System.in);
//
//	    sc.close();
//	}
//
//}

public class Main {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	
    	int num = sc.nextInt();
    	if(num==0) {
    		System.out.print("YONSEI");
    	}
    	else if(num==1) {
    		System.out.println("Leading the Way to the Future");
    	}
    	
//    	Chessborad chessborad = new Chessborad();  	
//    	chessborad.run();
    	sc.close();
    }
}
