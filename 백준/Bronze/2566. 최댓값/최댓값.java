import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int [][] nums = new int [9][9];

        int maxNum = 0;
        int maxNumRow = 0; //행
        int maxNumColumn = 0; //열

        for(int i =0; i<9; i++){
            for(int j =0; j<9; j++){
                nums[i][j] = sc.nextInt();
                if(maxNum <= nums[i][j]){
                    maxNum = nums[i][j];
                    maxNumRow = i+1;
                    maxNumColumn = j+1;
                }
            }
        }

        System.out.println(maxNum);
        System.out.print(maxNumRow + " " + maxNumColumn);

    }
}
