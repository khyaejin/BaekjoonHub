import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int studentNum = sc.nextInt();
        sc.nextLine(); // 개행 문자 소비

        int[][] candidateScore = new int[3][3];
        // 각 후보의 총점 / 3점 개수 / 2점 개수

        // 점수 추가
        for (int i = 0; i < studentNum; i++) {
            int score1 = sc.nextInt();
            int score2 = sc.nextInt();
            int score3 = sc.nextInt();
            sc.nextLine(); // 개행 문자 소비

            candidateScore[0][0] += score1;
            candidateScore[1][0] += score2;
            candidateScore[2][0] += score3;

            if (score1 == 3) candidateScore[0][1]++;
            if (score2 == 3) candidateScore[1][1]++;
            if (score3 == 3) candidateScore[2][1]++;

            if (score1 == 2) candidateScore[0][2]++;
            if (score2 == 2) candidateScore[1][2]++;
            if (score3 == 2) candidateScore[2][2]++;
        }

        int maxScore = 0;
        int maxScoreCandidate = -1;
        boolean tie = false;

        // 결과 계산
        for (int i = 0; i < candidateScore.length; i++) {
            if (candidateScore[i][0] > maxScore) { // 더 높은 총점을 가진 경우
                maxScore = candidateScore[i][0];
                maxScoreCandidate = i;
                tie = false;
            } else if (candidateScore[i][0] == maxScore) { // 총점이 같은 경우
                if (candidateScore[i][1] > candidateScore[maxScoreCandidate][1]) { // 3점 개수 비교
                    maxScoreCandidate = i;
                    tie = false;
                } else if (candidateScore[i][1] == candidateScore[maxScoreCandidate][1]) { // 3점 개수도 같은 경우
                    if (candidateScore[i][2] > candidateScore[maxScoreCandidate][2]) { // 2점 개수 비교
                        maxScoreCandidate = i;
                        tie = false;
                    } else if (candidateScore[i][2] == candidateScore[maxScoreCandidate][2]) { // 2점 개수도 같은 경우
                        tie = true;
                    }
                }
            }
        }

        if (tie) {
            System.out.println(0 + " " + maxScore);
        } else {
            System.out.println((maxScoreCandidate + 1) + " " + maxScore);
        }
    }
}
