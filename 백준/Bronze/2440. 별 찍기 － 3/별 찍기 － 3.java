import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        int starNum = sc.nextInt();
        for(int i =0; i<starNum; i++){
            for(int j=0; j<starNum; j++){
                if(j<starNum-i){
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}
