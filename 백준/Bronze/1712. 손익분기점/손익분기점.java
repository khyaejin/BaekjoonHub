import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong(); // 고정비용
        long B = sc.nextLong(); // 가변비용
        long C = sc.nextLong(); // 판매비용

        if (B >= C) {
            System.out.println("-1");
        } else {
            long result = A / (C - B) + 1;
            System.out.println(result);
        }
    }
}
