import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int totalReward = sc.nextInt();

        // case 1 : 전체 상금의 22%를 제세공과금으로 납부하는 경우
        double case1Reward = totalReward * (1 - 0.22);

        //case 2 : 상금의 80%를 필요 경비로 인정받고, 나머지 금액 중 22%만을 제세공과금으로 납부하는 경우
        double case2Reward = totalReward * 0.8 + totalReward * 0.2 * (1 - 0.22);

        System.out.print((int)case1Reward);
        System.out.print(" ");
        System.out.print((int)case2Reward);
    }
}
