import java.util.Scanner;

class Words {
	public void run() {
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		int num = sc.nextInt();
		
		System.out.println(word.charAt(num-1)); // 배열은 0번 인덱스 부터이므로
	}
}


public class Main {

    public static void main(String[] args) {
    	Words words = new Words();
    	words.run();
    }
}
