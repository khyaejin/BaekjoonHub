import java.util.Scanner;

public class Main {
    private static int N; // N행
    private static int M; // M열
    private static int[][] room; // 방 배열
    private static int x; // 현재 위치 (x좌표)
    private static int y; // 현재 위치 (y좌표)
    private static int d;// 바라보고 있는 방향
    private static int[] dx = {-1, 0, 1, 0}; // dx
    private static int[] dy = {0, 1, 0, -1}; // dy
    private static int count = 0; // 청소한 방의 수

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        // 입력 및 초기화
        N = sc.nextInt();
        M = sc.nextInt();
        room = new int[N][M];
        x = sc.nextInt();
        y = sc.nextInt();
        d = sc.nextInt();

        // 방 정보 입력받기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int type = sc.nextInt(); // 방 타입 (0 : 칸, 1 : 벽) (2 : 청소 완료)
                room[i][j] = type;
            }
        }

        // 로봇청소기가 정지할 때까지 반복
        while(true) {
            // 현재 칸이 청소되어있는지 확인
            if (room[x][y] == 0) { //청소 안 된 경우
                clean();
            }
            // 인접한 4칸 중 청소가 되지 않은 칸이 있는지 판별
            if (isAroundCleaned()) { // 청소 되지 않은 빈 칸이 있는 경우
                // 반시계 방향 90도 회전
                d = (d + 3) % 4;

                // 앞이 청소되지 않은 빈 칸인 경우 한 칸 전진
                if (room[x+dx[d]][y+dy[d]]==0) {
                    x = x + dx[d];
                    y = y + dy[d];
                }
            } else { // 청소 되지 않은 빈 칸이 없는 경우
                // 바라보는 방향대로 후진 가능한지 판별하는 메서드
                if (isReversePossible()) { // 후진 가능한 경우
                    // 한 칸 후진
                    x -= dx[d];
                    y -= dy[d];
                }else // 후진 불가능한 경우
                    // 종료
                    break;
            }
        }
        System.out.print(count);
    }

    // 청소하는 메서드
    private static void clean() {
        room[x][y] = 2; // 2 : 청소 완료
        count++;
    }

    // 바라보는 방향대로 후진 가능한지 판별하는 메서드
    private static boolean isReversePossible() {
        int backD = (d + 2) % 4;
        if(room[x+dx[backD]][y+dy[backD]]==1) { // 뒤가 벽인 경우
            return false;
        }
        else {
            return true;
        }
    }

    // 인접한 4칸 중 청소가 되지 않은 칸이 있는지 판별
    private static boolean isAroundCleaned() {
        // 모두 청소할 수 있는 칸(0) 이 아닌 경우
        if(room[x+dx[0]][y+dy[0]] != 0 && //북
                room[x+dx[1]][y+dy[1]] != 0 && // 동
                room[x+dx[2]][y+dy[2]] != 0 && // 남
                room[x+dx[3]][y+dy[3]] != 0 // 서
        ){ return false;}
        else{ return true;}
    }
}