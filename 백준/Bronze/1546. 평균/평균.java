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
				max = score[i]; //입력받으면서 최대값 구하기
			}
			sum += score[i]; //처음 입력된 점수의 합 구하기
		}
		
		sum = sum * 100 / max; //조작 후 점수의 합 구하기
		avg = sum / classNum; //조작 후 평균 구하기
		
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