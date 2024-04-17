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
            if(!(girlNum>=2 && boyNum>=1 && (girlNum-2+boyNum-1)>=internShipNum)) break;
            girlNum -= 2;
            boyNum -= 1;
            count++;

        }
        System.out.print(count);

    }
}
