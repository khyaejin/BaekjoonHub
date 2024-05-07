import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int sec = a + b + c + d;
        int min = sec/60;

        sec -= min * 60;

        System.out.println(min);
        System.out.println(sec);
        
    }
}