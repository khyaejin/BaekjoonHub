import java.util.Scanner;

class Max {
	int [] nums = new int [9]; // 자연수들 넣을 배열
	int max = 0; // 최대값 
	int id = 0; // 최대값의 순서
	
    public void run() {
    	Scanner sc = new Scanner(System.in);
    	
    	// 9개의 자연수 입력받아 배열에 넣기
    	for(int i=0; i<9; i++) {
    		nums[i] = sc.nextInt();
    	}
    	
    	// 최대값 판별하는 함수
    	discriminationMaximum();
    	
    	// 출력
    	System.out.println(max);
    	System.out.println(id);

    	sc.close();
   }
    
    private void discriminationMaximum() {
    	for(int i = 0; i<nums.length; i++) {
    		if(max < nums[i]) {
    			max = nums[i];
    			id = i + 1; // 배열은 0부터 시작이므로
    		}
    	}
    }
}

public class Main {

    public static void main(String[] args) {
    	Max max = new Max();
    	max.run();
    }
}
