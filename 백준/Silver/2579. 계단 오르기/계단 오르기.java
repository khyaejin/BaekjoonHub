/** [2579] 계단 오르기
 * 
 * greedy 아님.
 * 그 순간의 최적의 선택으로 되는 것이 아닌, 현재의 선택이 미래에 영향을 미침.
 * 순간의 최적 선택이 전체 최적이 아님
 * -> DP 사용 필요
 * 
 * 주요 조건
 * 1. 마지막 계단은 밟아야 한다.
 * 2. 3칸 연속 밟을 수 없다.
 * 
 * dp[i]: 현재 최대 점수
 * 1) 두칸 점프해서 도달
 * dp[i] = dp[i-2] + score[i]
 * 2) 한칸 전에서 도달. 단, 연속 두칸 밟고 올 수 없음(조건)
 * dp[i] = dp[i-1] + dp[i-3] + score[i]
 * 
 * 점화식
 * dp[i] = max(
 *     dp[i-2] +score[i], // 2칸 전 밟고 현재 칸 도달
 *     dp[i-3] + score[i-1] + score[i]) // 1칸전 + 3칸전 밟고 현재 칸 도달(3칸 연속은 안되므로)
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] score = new int [N+1]; // 각 계단 별 점수
        int [] dp = new int [N+1]; // 각 단계에서 최대 점수

        // 계단 정보 입력받기 
        for(int i = 1; i<= N; i++){
            score[i] = Integer.parseInt(br.readLine()); // 계단 점수
        }

        // N<3일 때
        if(N == 1){
            System.out.println(score[1]);
            return;
        } else if(N == 2){
            System.out.println(score[1]+score[2]);
            return;
        } 
        // N>=3일 때
        else{
            // 점화식 설정
            dp[1] = score[1];
            dp[2] = score[1] + score[2];
            dp[3] = Integer.max(score[1]+score[3], score[2] + score[3]);
            
            // 점화식 돌리기
            for(int i=4; i<=N; i++){
                dp[i] = Integer.max(dp[i-2]+ score[i], dp[i-3] + score[i-1] + score[i]);
            }

            // 최종 점수 출력
            System.out.println(dp[N]);
        }
    }
}
