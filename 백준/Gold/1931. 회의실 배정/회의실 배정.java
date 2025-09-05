// 1931
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        // 회의 정보 배열
        int mettings [][] = new int [N][2];

        // 입력받기
        for(int i = 0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            mettings[i][0] = Integer.parseInt(st.nextToken());
            mettings[i][1] = Integer.parseInt(st.nextToken());
        }

        // 회의 끝 시간을 기준으로 정렬
        Arrays.sort(mettings, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                if(a[1] == b[1]){ // 끝나는 시간이 같으면 시작시간 오름차순으로
                    return a[0] - b[0];
                }else{
                    return a[1] - b[1];
                }
            }
        });

        // 회의 선택
        int count = 0;
        int endHour = 0;
        for(int i =0; i<N; i++){
            if(endHour <= mettings[i][0]){ // 회의 종료 시간보다 크거나 같으면
                endHour = mettings[i][1];
                count++; // 회의 수 +1
            }
        }

        // 출력
        System.out.println(count);
    }
}
