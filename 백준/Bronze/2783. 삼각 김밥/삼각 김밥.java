import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int minPrice = sc.nextInt();
        int minGram = sc.nextInt();
        double minFinalPrice = Math.round((1000.0 * minPrice / minGram) * 100.0) / 100.0; // 반올림하여 소수점 둘째 자리까지 계산

        int numOfShop = sc.nextInt();

        for(int i = 0; i < numOfShop; i++) {
            int price = sc.nextInt();
            int gram = sc.nextInt();
            double finalPrice = Math.round((1000.0 * price / gram) * 100.0) / 100.0; // 반올림하여 소수점 둘째 자리까지 계산
            if(finalPrice < minFinalPrice) {
                minFinalPrice = finalPrice;
            }
        }
        System.out.print(minFinalPrice);
    }
}
