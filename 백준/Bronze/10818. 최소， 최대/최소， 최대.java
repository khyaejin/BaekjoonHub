import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 정수 개수를 입력받기
        int num = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < num; i++) {
            int input = Integer.parseInt(st.nextToken());
            if (max < input) {
                max = input;
            }
            if (min > input) {
                min = input;
            }
        }
        System.out.println(min + " " + max);

    }
}
