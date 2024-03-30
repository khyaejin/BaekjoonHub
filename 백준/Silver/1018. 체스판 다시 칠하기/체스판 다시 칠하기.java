import java.util.Scanner;

class Chessboard {
    public void run() {
        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt(); // 체스판의 세로길이
        int width = sc.nextInt(); // 체스판의 가로길이

        String[][] chessboard = new String[height][width]; // 체스판

        for (int i = 0; i < height; i++) {
            String row = sc.next();
            for (int j = 0; j < width; j++) {
                chessboard[i][j] = row.substring(j, j + 1);
            }
        } // 체스판 입력받기

        int minCount = Integer.MAX_VALUE; // 최소 다시 칠해야 하는 정사각형의 수

        // 체스판 비교
        for (int i = 0; i <= height - 8; i++) {
            for (int j = 0; j <= width - 8; j++) {
                int count = 0; // 다시 칠해야 하는 정사각형의 수
                
                // 체스판의 시작 위치 (i, j)로부터 8x8 크기의 체스판을 확인
                for (int x = i; x < i + 8; x++) {
                    for (int y = j; y < j + 8; y++) {
                        // 현재 위치 (x, y)의 색이 올바른지 확인하여 다시 칠해야 하는 경우 count 증가
                        if ((x + y) % 2 == 0 && !chessboard[x][y].equals("W")) {
                            count++;
                        } else if ((x + y) % 2 == 1 && !chessboard[x][y].equals("B")) {
                            count++;
                        }
                    }
                }
                
                // 현재 위치 (i, j)에서 시작하는 8x8 체스판을 다시 칠하는 경우와 그렇지 않은 경우 중에서 더 작은 값을 선택하여 minCount 갱신
                minCount = Math.min(minCount, Math.min(count, 64 - count));
            }
        }

        System.out.println(minCount); // 최소 다시 칠해야 하는 정사각형의 수 출력

        sc.close();
    }
}

public class Main {
    public static void main(String args[]) {
        Chessboard chessboard = new Chessboard();
        chessboard.run();
    }
}
