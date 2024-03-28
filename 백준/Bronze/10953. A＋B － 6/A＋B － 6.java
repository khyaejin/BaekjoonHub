import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int testcase = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 소비

        for (int i = 0; i < testcase; i++) {
            String line = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(line, ",");

            int sum = 0;
            while (st.hasMoreTokens()) {
                int num = Integer.parseInt(st.nextToken());
                sum += num;
            }

            System.out.println(sum);
        }
        scanner.close();
    }
}
