import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] height = new int[size];
        int minHeight = Integer.MIN_VALUE;
        int maxHeight = Integer.MAX_VALUE;
        int biggestUpDownHill = 0;

        height[0] = sc.nextInt(); //처음 수 입력받기

        minHeight = height[0];

        for (int i = 1; i < size; i++) {
            height[i] = sc.nextInt();

            if (height[i - 1] < height[i]) { //오르막길 이라면
                maxHeight = height[i];
            } else {//오르막길이 아니라면
                minHeight = height[i]; //현재 높이로
                maxHeight = 0; //초기화
            }

            if (biggestUpDownHill < maxHeight - minHeight) {//현재 오르막길의 높이가 기존 오르막길의 높이보다 크면
                biggestUpDownHill = maxHeight - minHeight; // 가장 큰 오르막길 높이 업데이트
            }


        }
        System.out.print(biggestUpDownHill);
    }

}
