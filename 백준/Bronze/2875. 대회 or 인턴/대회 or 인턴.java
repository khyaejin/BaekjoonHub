import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int girlNum = sc.nextInt(); //N
        int boyNum = sc.nextInt(); //M
        int internShipNum = sc.nextInt(); //K
        int count = 0;

        while(true){
            if(!(girlNum>=2 && boyNum>=1)) break; //팀을 결성하지 못하면 종료
            girlNum -= 2;
            boyNum -= 1;
            if(!((girlNum+boyNum)>=internShipNum)) break; //팀 결성 후 인턴쉽 나갈 인원이 부족하면 count하지 않고 종료
            count++;

        }
        System.out.print(count);

    }
}
