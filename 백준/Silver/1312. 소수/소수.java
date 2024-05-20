import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numerator = sc.nextInt(); //분자
        int denominator = sc.nextInt(); //분모
        int n = sc.nextInt(); //소숫점 아래 N번째 자리수


        // 정수 나눗셈을 사용하여 소수점 아래 N번째 자리수 구하기
        for (int i = 0; i < n; i++) {
            numerator = (numerator % denominator) * 10;
        }

        // 소수점 아래 N번째 자리 숫자 출력
        int nthDigit = numerator / denominator;
        System.out.println(nthDigit);
    }
}
