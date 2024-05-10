import java.io.*;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();
        v.add(sc.nextInt());
        v.add(sc.nextInt());
        v.add(sc.nextInt());

        Collections.sort(v);
        System.out.println(v.get(1));
    }
}