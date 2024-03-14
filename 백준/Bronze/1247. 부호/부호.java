import java.math.BigInteger;
import java.util.Scanner;

class Sign {
    public void run() {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int[] signs = new int[3]; // 부호 저장해 둘 배열

        while (true) {
            if (count == 3) break; // 총 3번 반복

            int integerNum = sc.nextInt();
            BigInteger sum = BigInteger.ZERO; // BigInteger 사용

            // 입력받기
            for (int i = 0; i < integerNum; i++) {
                sum = sum.add(sc.nextBigInteger());
            }

            // 부호판별
            if (sum.compareTo(BigInteger.ZERO) < 0) {
                signs[count] = -1; // 음수
            } else if (sum.compareTo(BigInteger.ZERO) > 0) {
                signs[count] = 1; // 양수
            } else {
                signs[count] = 0; // 0
            }
            count++;
        }
        // 출력
        for (int sign : signs) { // for-each문 사용
            if (sign < 0) {
                System.out.println("-");
            } else if (sign > 0) {
                System.out.println("+");
            } else {
                System.out.println("0");
            }
        }
    }
}
    
public class Main {

    public static void main(String[] args) {
        Sign sign = new Sign();
        sign.run();
    }
}
