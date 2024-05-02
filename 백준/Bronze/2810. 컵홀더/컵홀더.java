import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int seatNum = sc.nextInt();
        String seats = sc.next();
        boolean doesCopleExist = false;

        int maxPeopleWhoCanUseCupholder = 0; //컵 홀더를 사용할 수 있는 사람의 최대 수
        for (int i = 0; i < seatNum; i++) {
            char seat = seats.charAt(i);

            if (seat == 'S') { //java에서 문자끼리의 비교는 ==으로
                maxPeopleWhoCanUseCupholder++;
            }
            else if(seat == 'L'){
                doesCopleExist = true;
                maxPeopleWhoCanUseCupholder++;
                i++; //L은 커플로 항상 두개씩 쌍으로 존재
            }
        }

        if(doesCopleExist) {
            maxPeopleWhoCanUseCupholder++;
        }

        System.out.println(maxPeopleWhoCanUseCupholder);

    }
}
