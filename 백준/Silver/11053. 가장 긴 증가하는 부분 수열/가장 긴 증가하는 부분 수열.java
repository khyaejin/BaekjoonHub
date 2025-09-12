/*
 * [11053] 가장 긴 증가하는 부분 수열 (Silver 2)
 * 부분수열: 원래 순서를 유지하면서 일부 원소를 뽑아 만든 수열
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] sequence = new int [N+1];
        int[] dp = new int[N+1]; // i까지 중 가장 큰 증가하는부분배열 개수
        int maxSeqenceLenght = 1; // 가장 큰 수열의 길이

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 입력
        for(int i = 1; i<= N; i++){
            sequence[i] = Integer.parseInt(st.nextToken());
        }

        dp[1] = 1;
        // 2부터 i까지 dp 채우기
        for(int i = 2; i<=N; i++){
            int maxCnt = 0;

            // i까지의 모든 요소 탐색
            for(int j = 1; j<i; j++){
                // 현재 요소보다 작은 요소에 한해서
                if( sequence[j] < sequence[i]){
                    if(maxCnt < dp[j]) maxCnt = dp[j];
                }
            }
            // 현재 요소 추가해 저장
            dp[i] = maxCnt + 1;
            
            // maxSeqenceLenght에 반영
            if(maxSeqenceLenght<dp[i]) maxSeqenceLenght = dp[i];
        }

        // 출력
        System.out.println(maxSeqenceLenght);
    }
}
