import java.util.Scanner;

class Honeycomb {

	public void run() {
		Scanner sc = new Scanner(System.in);
		int roomNum = sc.nextInt();
		
		if(roomNum == 1) {
			System.out.println(1);
		}
		
		else {
			int passNum = 1; //통과한 벌집 수
			int maxRoom = 1; //현재 passNum에서 도달할 수 있는 가장 큰 값을 지닌 벌집
			int increment = 6; //방의 증가량
			
			while(true) {
				maxRoom += increment; //도달할 수 있는 가장 큰 값을 지닌 벌집 업데이트
				
				if(roomNum<=maxRoom) {	//현재 도달할 수 있는 maxRoom보다 입력한 roomNum이 작을 시	
					System.out.println(passNum + 1);
					break;
				}
				passNum++;
				increment += 6;			
			}
		}
	}
}


public class Main {

    public static void main(String[] args) {
    	Honeycomb honeycomb = new Honeycomb();
    	honeycomb.run();
    }
}