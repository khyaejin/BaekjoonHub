import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //듣도 못한 사람 수
        int M = sc.nextInt(); //보도 못한 사람 수

        HashSet<String> unheard = new HashSet<>(); //듣도 못한 사람 명단
        HashSet<String> unseen = new HashSet<>(); //보도 못한 사람 명단
        ArrayList<String> result = new ArrayList<>(); //결과 명단

        // 듣도 못한 사람 입력받기
        for (int i = 0; i < N; i++) {
            unheard.add(sc.next());
        }

        // 보도 못한 사람 입력받기
        for (int i = 0; i < M; i++) {
            unseen.add(sc.next());
        }

        // 교집합 구하기
        unheard.retainAll(unseen);

        // 교집합 결과를 리스트로 변환하여 정렬
        result.addAll(unheard);
        Collections.sort(result);

        // 결과 출력
        System.out.println(result.size());
        for (String name : result) {
            System.out.println(name);
        }
    }
}
