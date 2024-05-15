import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        double totalGrade = 0; // 총 성적
        int totalCredit = 0; // 총 학점

        while (testCase-- > 0) {
            String[] input = br.readLine().split(" ");
            // String className = input[0]; // 과목명은 사용하지 않음
            int credit = Integer.parseInt(input[1]); // 학점
            String grade = input[2]; // 성적

            double gradePoint = convertGradeToPoint(grade); // 성적을 학점으로 변환

            // 해당 과목의 학점 * 성적을 총 성적에 더함
            totalGrade += credit * gradePoint;
            // 해당 과목의 학점을 총 학점에 더함
            totalCredit += credit;
        }

        // 총 성적을 총 학점으로 나누어 평균 평점 계산
        double avg = totalGrade / totalCredit;

        // 소수점 셋째 자리에서 반올림해서 둘째 자리까지 출력
        System.out.printf("%.2f", avg);
    }

    // 성적을 학점으로 변환하는 메서드
    private static double convertGradeToPoint(String grade) {
        switch (grade) {
            case "A+":
                return 4.3;
            case "A0":
                return 4.0;
            case "A-":
                return 3.7;
            case "B+":
                return 3.3;
            case "B0":
                return 3.0;
            case "B-":
                return 2.7;
            case "C+":
                return 2.3;
            case "C0":
                return 2.0;
            case "C-":
                return 1.7;
            case "D+":
                return 1.3;
            case "D0":
                return 1.0;
            case "D-":
                return 0.7;
            default:
                return 0.0; // F 학점의 경우
        }
    }
}
