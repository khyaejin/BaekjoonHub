/**
 * 2230 수 고르기(gold 5)
 * 제한 2초: (java) 1억 ~ 1억 5천만정도
 * N = 100,000 -> O(N logN)까지 가능
 * 수열이 정렬 되었다는 말 X -> 정렬 후 계산 필요
 * 
 * 키: 투포인터, 정렬
 */
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int [] arr = new int [N]; // 수열

        // 입력받기: O(n)
        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        // arr 정렬: O(NlogN)
        Arrays.sort(arr);

        int L = 0, R = 0; // 조건) 가을 수 있음
        int diff = 0;
        int minDiff = Integer.MAX_VALUE;

        // 두 수 차이가 M 이상, 가장 작은 경우 구하기: O(N)
        while(L<N && R <N){
            diff = arr[R] - arr[L];

            if(diff>=M){ 
                if(diff < minDiff) minDiff = diff;
                L++;
            }else{
                R++;
            }
        }
        System.out.print(minDiff);
    }
}
/**
 * 리뷰
 * 일반적인 투포인트 방식: L증가, R증가 방식
 * L, R 초기값: 최소 차이를 찾는 것이기 때문에 최대 차이인 양 끝 포인터보다 L최소 R최소 포인터로 시작하는게 자연스러움
 * while문 범위: 현재 문제 기준, L<N, R<N

 */
