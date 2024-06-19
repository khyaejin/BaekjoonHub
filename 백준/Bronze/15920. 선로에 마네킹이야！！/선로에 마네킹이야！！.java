import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
         
        int N = Integer.parseInt(sc.next());
         
        String str = sc.next();
         
        // 1 = 'A'구역, 2 = 'B'구역, 3 = 'C'구역으로 정의
        int train = 1;
         
        // 처음 레버는 '당기지 않은 상태'이므로
        int answer = 5;
        boolean lever = false;
        for(int i=0; i<N; i++) {
            String action = str.substring(i, i+1);
             
            if(train == 3) { // 이미 C 구역에 왔다면 종료
                break;
            }
             
            if(action.equals("W")) {
                train++;
            }else if(action.equals("P")) {
                // 현재 광차의 위치에 따라 정의한다.
                // 광차가 A 구역에 있다면
                if(train == 1) {
                    if(lever) { // 기존의 레버가 당겨져 있는 상태라면 다시 초기의 상태로 돌리는 행위이다.
                        answer = 5;
                    }else { // 레버를 '당김' 상태로 두는 것.
                        answer = 1;
                    }
                    // 레버를 기존의 상태에서 반대로 전환
                    lever = !lever;
                }else if(train == 2) {
                    // 광차가 B 구역에 있다면 일단 멀티트랙 드리프팅 현상이 일어나 모든 경로로 가게 된다.
                    answer = 6;
                }
            }
        }
         
        // 광차가 C 구역에 도달하기 전에 행동이 끝났다면
        if(train < 3) {
            answer = 0;
        }
        System.out.println(answer);
         
    }
}