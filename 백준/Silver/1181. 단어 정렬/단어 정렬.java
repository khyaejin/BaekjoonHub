import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        Vector<String> v = new Vector<String>();

        while (testCase-- > 0) {
            String word = br.readLine();
            v.add(word);
        }
        Collections.sort(v, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                //compare은 양수인 경우 정렬 알고리즘에 의해 위치를 바꾸고, 0이나 음의 정수인 경우 바꾸지 않는다
               if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length(); //o1의 길이가 더 길면 양수 리턴 -> 자리 바꿈
                }
            }
        });

        for (int i = 0; i < v.size(); i++) {
            if (i == 0) {
                System.out.println(v.get(i));
            }else{
                if(!(v.get(i).equals(v.get(i-1)))){
                    System.out.println(v.get(i));
                }
            }
        }
    }
}
