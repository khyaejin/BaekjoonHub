import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //열의 개수 K(1 ≤ K ≤ 20)
        int colNum = sc.nextInt();

        //암호화 된 문자열(영소문자)
        //(문자열의 길이는 200 이하이며 K의 배수이다.)
        String st = sc.next();
        int rowNum = st.length() / colNum ;

        char[][] secreatStrings = new char[rowNum][colNum];


        int count=0;

        for (int i = 0; i < rowNum; i++) {

            for (int j = 0; j < colNum; j++) {
                //홀수열 왼->오
                if (i % 2 == 0) {
                    secreatStrings[i][j] = st.charAt(count++);
                }
                //짝수열 오->왼
                else if (i % 2 == 1) {
                    secreatStrings[i][colNum-j-1] = st.charAt(count++);
                }
            }
        }

        for (int j = 0; j < colNum; j++) {
            for (int i = 0; i < rowNum; i++) {
                System.out.print(secreatStrings[i][j]);
            }
        }


    }
}
