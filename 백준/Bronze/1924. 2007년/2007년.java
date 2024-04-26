import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        String[] weeks = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"}; //요일 저장 배열

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); //x월
        int y = sc.nextInt(); //y일

        int days = 0; //2007년 1월 1일로부터 총 지난 날짜

        for (int i = 1; i < x; i++) { //총 일수로 환산 : x월 일수로 환산
            if (i == 2) { //2월의 경우 28일까지
                days+=28;
            } else if (i == 4 || i == 6 || i == 9 || i == 11) { //4,6,9,11월은 30일까지
                days += 30;
            }
            else{ //그 외 : 3,5,7,8,10,12월은 31일까지
                days += 31;
            }
        }
        days += y;//총 일수로 환산 : y일 더하기

        int remain = days % 7;

        System.out.print(weeks[remain]);


    }

}