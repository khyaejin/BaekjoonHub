import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int roofNum = Integer.parseInt(st.nextToken());
            String word = st.nextToken();

            for (int i = 0; i < word.length(); i++) {
                for (int j = 0; j < roofNum; j++) {
                    System.out.print(word.charAt(i));
                }
            }
            System.out.println();
        }

    }
}
