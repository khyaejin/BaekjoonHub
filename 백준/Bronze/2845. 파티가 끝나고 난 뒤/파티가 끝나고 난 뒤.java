import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int studentNum = N*M;

        for (int i = 0; i < 5; i++) {
            int newsNum = sc.nextInt();
            System.out.print(newsNum - studentNum + " ");
        }

    }
}
