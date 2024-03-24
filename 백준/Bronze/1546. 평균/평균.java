import java.util.Scanner;
import java.io.IOException;
import java.math.BigInteger;
 
class Average{
	public void run(){
		Scanner sc = new Scanner(System.in);
		
		int classNum = sc.nextInt();
		
		int [] score = new int[classNum];
		int max = 0;
		double sum = 0;
		
		double avg = 0;
		
		for(int i = 0; i<classNum; i++){
			score[i] = sc.nextInt();
			if(score[i] > max) {
				max = score[i];
			}
			sum += score[i];
		}
		
		sum = sum * 100 / max;
		avg = sum / classNum;
		
		System.out.println(avg);
		
		sc.close();			
	}
}

public class Main {
 
	public static void main(String[] args) throws IOException {
		Average average = new Average();
		average.run();
	}
}