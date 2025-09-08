import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * [14719] 빗물 (gold5)
 * 세로 H, 가로 W
 * 
 * 핵심 아이디어
 * i 블록에서 min(우측 최대 블록, 좌측 최대 블록)을 구한 후
 * 해당 블록 높이와 i 블록 높이의 차이만큼이 최종적으로 물이 찰 높이
 * 
 * i 블록에서 좌/우측 방향으로 최대 높이를 구하는 방법
 * 좌측 최대: max(i-1, block[i])
 * 우측 최대: max(i+1, block[i])
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int[] block = new int[W+1];
        int maxLeftHeight[] = new int[W+1]; //좌측 최대
        int maxRightHeight[] = new int[W+1]; //우측 최대
        int sumWater=0; 

        // 입력
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < W; i++) {
            block[i] = Integer.parseInt(st.nextToken());
        }

        // 좌측 최대 구하기
        maxLeftHeight[0] = block[0];
        for(int i=1; i<W; i++){
            maxLeftHeight[i] = Math.max(maxLeftHeight[i-1], block[i]);
        }

        // 우측 최대 구하기
        maxRightHeight[W] = block[W];
        for(int i = W-1; i>0; i--){
            maxRightHeight[i] = Math.max(maxRightHeight[i+1], block[i]);
        }

        // 빗물 구하기
        for(int i=0; i<W; i++){
            int waterAmoount = Math.min(maxLeftHeight[i], maxRightHeight[i])-block[i];
            if(waterAmoount>0){
                sumWater += waterAmoount;
            }
        }

        // 출력
        System.out.println(sumWater);

    }
}
