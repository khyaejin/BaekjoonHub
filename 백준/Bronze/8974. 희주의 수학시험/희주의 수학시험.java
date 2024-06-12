import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[1001];
        int k = 1, sum = 0;
        int a, b;
        
        a = scanner.nextInt();
        b = scanner.nextInt();
        
        for (int i = 1; i <= 1000;) {
            for (int j = 1; j <= k && i <= 1000; j++)
                arr[i++] = k;
            k++;
        }
        
        for (int i = a; i <= b; i++)
            sum += arr[i];
        
        System.out.println(sum);
    }
}
