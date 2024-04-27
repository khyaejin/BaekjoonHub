import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase > 0) { //총 testCase만큼 반복
            StringTokenizer st = new StringTokenizer(br.readLine(), " "); //br로 한 줄 읽어서 " " 단위로 구분
            int[] nums = new int[10];

            for (int i = 0; i < nums.length; i++) {
                nums[i] = Integer.parseInt(st.nextToken()); //nums배열에 넣어주고
            }

            Arrays.sort(nums); //정렬

            System.out.println(nums[7] + " "); //3번재로 큰 수 업로드

            testCase--;
        }
    }
}
