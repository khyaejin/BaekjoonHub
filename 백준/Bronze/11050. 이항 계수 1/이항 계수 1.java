import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        //N C K
        // 54321 / 321 * 21

        if(K==0 || K==N){
            System.out.println("1");
        }else{
            // n! / n-k! k!
            int numerator = factorial(N - K) * factorial(K);

            int denominator = factorial(N);
            System.out.println(denominator/numerator);
        }

    }
    public static  int factorial(int a){
        if(a==1){
            return 1;
        }else{
            return factorial(a-1) * a;
        }
    }
}
