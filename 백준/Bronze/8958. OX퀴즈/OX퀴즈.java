import java.util.Scanner;

class Quiz {
	private Scanner sc = new Scanner(System.in);
	private int testCase;
	private int [] scores;
	private String [] answer;
	// -> 선언만

    public void run() {
    	testCase = sc.nextInt();
    	scores = new int [testCase]; //점수 넣을 배열
    	answer = new String [testCase]; //답 넣을 배열.. OXOX
    	 
    	//입력
    	for(int i =0; i<testCase; i++) {
    		answer[i] = sc.next();
    	}
    	
    	//점수 판별
    	quizScore();
    	
    	// 점수 출력
    	for(int score : scores) {
    		System.out.println(score);
    	}
    	sc.close();
   }
    
    private void quizScore() {
    	for(int i = 0; i<answer.length; i++) {
    		int cnt = 0;
    		int sum = 0;
    		
    		for(int j =0; j<answer[i].length(); j++) {
    			if(answer[i].charAt(j) == 'O') { //String의 경우에만 equals() 사용
    				cnt++; //연속으로 맞으면 누적
    			}
    			else {
    				cnt = 0; //틀리면 처음부터
    			}
    			
    			sum += cnt; //최종 점수 계산
    		}
    		scores[i] = sum; //최종 점수 삽입
    	}
    }
}

public class Main {

    public static void main(String[] args) {
    	Quiz quiz = new Quiz();
    	quiz.run();
    }
}
