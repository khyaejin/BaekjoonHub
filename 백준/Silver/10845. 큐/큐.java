import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();
        int last = 0; //마지막 값을 위한 변수

        while(testCase-- > 0){
            String[] instruction = br.readLine().split(" ");

            switch (instruction[0]){
                case "push" :
                    int num = Integer.parseInt(instruction[1]);
                    q.offer(num);
                    last = num;
                    break;
                case "pop":
                    if (q.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(q.poll()); // 제거 하며 읽기
                    }
                    break;
                case "size" :
                    System.out.println(q.size());
                    break;
                case "empty" :
                    System.out.println(q.isEmpty() ? 1 : 0);
                    break;
                case "front" :
                    if (q.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(q.peek());
                    }
                    break;
                case "back":
                    if (q.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(last);
                    }
                    break;
            }

        }
        br.close();
    }
}
