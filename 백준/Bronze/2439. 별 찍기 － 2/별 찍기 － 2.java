import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        int starNum = sc.nextInt();
        for(int i =0; i<starNum; i++){
            for(int j=1; j<=starNum; j++){
                if(j<starNum-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");

                }
            }
            System.out.println();

        }
    }
}
