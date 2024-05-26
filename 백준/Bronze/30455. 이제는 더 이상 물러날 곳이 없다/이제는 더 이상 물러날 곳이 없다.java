import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N%2==0){ // 짝수
            System.out.println("Duck");
        }else{//홀수
            System.out.println("Goose");
        }
    }

}

