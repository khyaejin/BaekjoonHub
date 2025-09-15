/**
 * 수들의 합2(silver 5)
 * - 시간제한
 * 0.5ch -> 5,000만 ~ 1억 정도 연산
 * 1<=N<=10,000
 * N^2 = 10 ^8 -> 1억
 * O(N^2)은 조금 위험, O(N)이 안전한 풀이 
 * 
 * 키워드: 누적합, 투포인트
 * 
 */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int [] sum = new int [N+1];

        // 누적합 구하기: O(n)
        st = new StringTokenizer(br.readLine());

        sum[0] = 0;
        for(int i = 1; i<=N; i++){
            sum[i] = Integer.parseInt(st.nextToken()) + sum[i-1];
        }

        // 부분합이 M이 되는 경우의 수 구하기 : O(N)
        int L=1, R = 1, caseCount = 0;
        while(R<=N){
            int currentSum = sum[R] - sum[L-1];
            if( currentSum == M){ // 부분합이 M이면
                caseCount++;
                R++;
            }else if(currentSum > M){ // 부분합이 M보다 크면
                L++;
            }else{ // 부분합이 M보다 작으면
                R++;
            }
        }
        System.out.print(caseCount);
    }
}