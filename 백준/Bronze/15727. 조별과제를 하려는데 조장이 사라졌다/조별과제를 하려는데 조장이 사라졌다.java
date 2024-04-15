import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int hour = 0;

        while(true){
            if(range>5){
                hour++;
                range-=5;
            }
            else{
                hour++;
                break; //종료
            }
        }
        System.out.print(hour);




    }

}
