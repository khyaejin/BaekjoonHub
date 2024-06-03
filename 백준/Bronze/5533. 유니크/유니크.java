import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int playerNum = sc.nextInt();
        int[] playersScore = new int [playerNum];
        int [][] playersWrite = new int[playerNum][3];

        //점수 입력
        for (int i = 0; i < playerNum; i++) {
            for (int j = 0; j < 3; j++) {
                playersWrite[i][j] = sc.nextInt();
            }
        }

        //점수 계산
        for (int i = 0; i < playerNum; i++) {
            for (int j = 0; j < 3; j++) {
                boolean unique = true;
                for (int num = 0; num < playerNum; num++) {
                    if (i != num && playersWrite[i][j] == playersWrite[num][j]) {
                        unique = false;
                        break;
                    }
                }
                if (unique) {
                    playersScore[i] += playersWrite[i][j];
                }
            }
        }

        //결과 출력
        for (int i = 0; i < playerNum; i++) {
            System.out.println(playersScore[i]);
        }

        sc.close();
    }
}
