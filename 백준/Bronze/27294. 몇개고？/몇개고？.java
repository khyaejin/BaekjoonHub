import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int S = sc.nextInt();

        if(S==0 && (12<=T) && (T<=16)) {// 점심 식사이면서 술과 같이 먹지 않을때
            System.out.print("320");

        }
        else{
            System.out.print("280");
        }
    }
}