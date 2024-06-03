import java.util.Scanner;

public class Main {
    
    // 최대 공약수를 계산하는 메소드
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 문제 세트의 수 입력 받기
        int n = scanner.nextInt();
        
        // 각 문제 세트에 대해 최대 공약수 계산 및 출력
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(gcd(a, b));
        }
        
        scanner.close();
    }
}
