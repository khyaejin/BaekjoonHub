import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String word = br.readLine();
            int length = word.length();
            int point = length - 1;
            boolean isIt = true;

            if (word.equals("0")) {
                break;
            }

            for (int i = 0; i < length / 2; i++) {
                if(word.charAt(i) != word.charAt(point)){
                    isIt = false;
                    break;
                }
                point--;
            }
            if(isIt){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }



        }

    }
}
