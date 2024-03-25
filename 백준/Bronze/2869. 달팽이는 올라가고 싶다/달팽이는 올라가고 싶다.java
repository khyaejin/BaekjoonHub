import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SnailClimbingTime{
    public void run(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리더 사용

        try {
            String[] input = br.readLine().split(" "); // 공백으로 구분된 입력값 읽기

            int A = Integer.parseInt(input[0]); // 낮에 올라가는 높이
            int B = Integer.parseInt(input[1]); // 밤에 미끄러지는 높이
            int V = Integer.parseInt(input[2]); // 총 올라가야 하는 높이

            int days = (V - B - 1) / (A - B) + 1; // 공식으로 계산

            System.out.println(days);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close(); // BufferedReader 닫기
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {
        SnailClimbingTime time = new SnailClimbingTime();
        time.run();
    }
}
