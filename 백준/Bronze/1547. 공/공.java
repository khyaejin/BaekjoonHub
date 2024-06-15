import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean [] cups = new boolean[3];
        cups[0] = true; //공이 들어있음
        cups[1] = false;
        cups[2] = false;

        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            int a = sc.nextInt() - 1; //배열시작이 0부터 이므로 -1
            int b = sc.nextInt() - 1;
            
            boolean tmp = cups[a];
            cups[a] = cups[b];
            cups[b] = tmp;
        }

        for (int i = 0; i < 3; i++) {
            if (cups[i] == true) {
                System.out.print(i+1);
                break;
            }
        }

    }
}
