//https://www.acmicpc.net/problem/15650
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    private static int N,M;
    private static List<Integer> sequence = new ArrayList<>(); // 출력할 수열을 저장하는 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 입력
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 백트레킹 시작
        backtrack(0); // depth : 수열의 길이, 0부터 시작

    }

    // 백트레킹 메서드
    private static void backtrack(int depth) {
        // 조건) depth == M일시 출력 (종료 조건)
        if (depth == M) {
            // 수열에 담긴 모든 요소 출력
            for (int num : sequence) { // sequence의 요소를 모두 num에 할당
                System.out.print(num + " "); // 조건) 각 수열은 공백 문자로 구분해서 출력
            }
            System.out.println();
        }

        // 조건) 1부터 N까지의 자연수 탐색
        for (int i = 1; i <= N; i++) {
            // 조건) 수열은 오름차순 이어야 함
            // 수열에 아무것도 없는 경우엔 넘어가기
            if (sequence.isEmpty()) {
            } else{
                // 직전 수열의 값이 추가하려는 수열의 값보다 크거나 같으면 빠져나가기
                if (sequence.get(sequence.size() - 1) >= i) continue;
            }

            // 조건) 중복 안됨
            // i를 수열에서 포함하고 있으면 빠져나가기
            if (sequence.contains(i)) continue;

            // 조건 만족 시 수열에 추가
            sequence.add(i);

            // 백트래킹
            backtrack(depth + 1); // 수열의 길이 1 증가

            // 수열에서 제거
            sequence.remove(sequence.size() - 1); // 인덱스는 0부터 시작, size -1 필요
        }
    }

}
