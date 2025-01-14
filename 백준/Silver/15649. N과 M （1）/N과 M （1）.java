//https://www.acmicpc.net/problem/15649
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int N, M; // 입력값 N, M
    static List<Integer> sequence = new ArrayList<>(); // 현재 수열을 저장

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 수열 생성 시작 (백트래킹)
        backtrack(0); //depth : 수열 길이, 0으로 시작
    }

    // 백트래킹 메서드
    private static void backtrack(int depth) {
        // 조건) 수열 길이가 M이 되면 출력 (종료 조건)
        if (depth == M) {
            for (int num : sequence) {
                System.out.print(num + " "); // 조건) 각 수열은 공백으로 구분해서 출력
            }
            System.out.println();
            return;
        }

        // 조건) 수열은 사전 순으로 증가하는 순서로 출력
        // 1부터 N까지 숫자를 순차적으로 확인
        for (int i = 1; i <= N; i++) {
            // 조건) 이미 사용된 숫자는 건너뜀 (중복 x)
            if (sequence.contains(i)) continue;

            // 현재 숫자를 수열에 추가
            sequence.add(i);

            // 재귀 호출로 다음 숫자 선택
            backtrack(depth + 1);

            // 현재 숫자를 수열에서 제거 (백트래킹)
            sequence.remove(sequence.size() - 1); // 리스트 시작은 0번부터기 때문에 -1, 사이즈가 2라면 1번 인덱스의 값 삭제
        }
    }
}
