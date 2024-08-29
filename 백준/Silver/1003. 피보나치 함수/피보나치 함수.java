import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final int MAX = 41; // This is a safe upper limit based on the problem constraints
    private static int[] fibCounts0 = new int[MAX];
    private static int[] fibCounts1 = new int[MAX];

    static {
        // Initialize base cases
        fibCounts0[0] = 1; // Fib(0) = 0
        fibCounts1[0] = 0;
        fibCounts0[1] = 0; // Fib(1) = 1
        fibCounts1[1] = 1;

        // Fill counts for all Fibonacci numbers up to MAX
        for (int i = 2; i < MAX; i++) {
            fibCounts0[i] = fibCounts0[i - 1] + fibCounts0[i - 2];
            fibCounts1[i] = fibCounts1[i - 1] + fibCounts1[i - 2];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine().trim());

        StringBuilder sb = new StringBuilder();

        while (testCase-- > 0) {
            int N = Integer.parseInt(br.readLine().trim());
            sb.append(fibCounts0[N]).append(" ").append(fibCounts1[N]).append("\n");
        }

        System.out.print(sb.toString());
    }
}
