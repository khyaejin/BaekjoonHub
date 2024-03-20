import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");
        int M = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);

        boolean[] prime = new boolean[N + 1]; // 소수 판별 배열 생성

        // 소수 판별 배열 초기화
        for (int i = 2; i <= N; i++) {
            prime[i] = true;
        }

        // 에라토스테네스의 체 알고리즘
        for (int i = 2; i * i <= N; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    prime[j] = false;
                }
            }
        }

        // 소수 출력
        for (int i = M; i <= N; i++) {
            if (prime[i]) {
                sb.append(i).append('\n');
            }
        }

        System.out.println(sb);
    }
}
