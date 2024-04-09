import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fan = ":fan:";
        String me = sc.next();

        for(int i = 0; i< 3; i++){
            for(int j = 0; j< 3; j++){
                if(i==1 && j==1){
                    System.out.print(":" + me + ":");
                }
                else{
                    System.out.print(fan);
                }

            }
            System.out.println();

        }



        sc.close();
    }
}