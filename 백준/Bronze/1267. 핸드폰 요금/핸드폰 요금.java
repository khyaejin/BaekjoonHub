import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        int yMoney = 0; // 영식 요금제 비용
        int mMoney = 0; // 민식 요금제 비용

        for (int i = 0; i < testCase; i++) {
            int callTime = sc.nextInt();
            
            // 영식 요금제 비용 계산
            yMoney += ((callTime / 30) + 1) * 10;
            
            // 민식 요금제 비용 계산
            mMoney += ((callTime / 60) + 1) * 15;
        }

        // 결과 출력
        if (yMoney < mMoney) {
            System.out.println("Y " + yMoney);
        } else if (yMoney > mMoney) {
            System.out.println("M " + mMoney);
        } else {
            System.out.println("Y M " + yMoney);
        }
    }
}
