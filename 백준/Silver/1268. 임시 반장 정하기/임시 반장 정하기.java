import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int studentNum = sc.nextInt(); //문제에 주어지는 학생 수

        int [] sameClassStudentsNum = new int [studentNum]; //같은 반이 된 적 있는 학생 수를 저장할 배열
        int[][] studentInClassChart = new int[studentNum][5]; //학생들의 반 정보를 저장할 배열

        //학생들의 반 정보 입력받기
        for (int i = 0; i < studentNum; i++) {
            for (int j = 0; j < 5; j++) {
                studentInClassChart[i][j] = sc.nextInt();
            }
        }

        //메인 로직 : 다른 학생과 같은 반 된 적 있는 수 세기
        for (int i = 0; i<studentNum; i++) { //학생
            for (int k = i+1; k < studentNum; k++) { //학생 i+1부터 k까지
                for (int j = 0; j < 5; j++) { //5학년에 대해 검사
                    if (studentInClassChart[i][j] == studentInClassChart[k][j]) {
                        sameClassStudentsNum[i]++;
                        sameClassStudentsNum[k]++;
                        break;
                    }
                }
            }
        }

            //메인로직 : 가장 많이 다른 학생과 같은 반이 된 적 있는 학생 찾기 & 출력
            int maxStudentNum = Integer.MIN_VALUE; //제일 많이 같은반을 많이 한 횟수
            int leader = 0;

            for (int i = 0; i < studentNum; i++) {
                if (maxStudentNum < sameClassStudentsNum[i]) {
                    maxStudentNum = sameClassStudentsNum[i];
                    leader = i;
                }
            }
            System.out.println(leader+1);
    }
}