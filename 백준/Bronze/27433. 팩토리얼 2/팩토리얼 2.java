import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();


        System.out.print(factorial(N));



    }
    public static long factorial(int n) {
        if (n <= 0) {
            return 1;
        }
        else{
            return n * factorial(n - 1);
        }
    }
}