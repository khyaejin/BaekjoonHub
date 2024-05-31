import java.sql.SQLOutput;
import java.util.*;
import java.io.*;

public class Main {

    static int N, M;
    static int[][] map;

    static int[] dx = {0, 1, 0, -1}; // 오른쪽으로, 아랫쪽으로, 왼쪽으로, 윗쪽으로
    static int[] dy = {1, 0, -1, 0};
    
    static boolean[][] isVisited;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        M = sc.nextInt();
        N = sc.nextInt();
        sc.close();

        map = new int[M][N];
        isVisited = new boolean[M][N];

        int cnt = 0; // 출력할 꺽은 횟수
        int sum = 0; // 지나온 칸 수 -> 종료 조건으로 사용

        int idx = 0; // 다음 칸 탐색할 때 쓸 인덱스
        int nowX = 0; // 현재 좌표
        int nowY = 0;
        isVisited[nowX][nowY] = true;
        sum = 1;

        while(idx < 4) {
            int nx = nowX + dx[idx]; // 탐색한 새로운 좌표
            int ny = nowY + dy[idx];

            if (sum == N * M) {
                System.out.println(cnt);
                return;
            }

            if(nx >= 0 && ny >= 0 && nx < M && ny < N && !isVisited[nx][ny]) {
                sum++; 
                isVisited[nx][ny] = true;
                nowX = nx; 
                nowY = ny;
            }
            
            else {
                idx++;
                cnt++; 
            }

            if(idx >= 4) {
                idx = 0;
            }
        }

    }

}