import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fileNum = sc.nextInt(); // 파일의 개수를 입력받음
        sc.nextLine(); // 개행 문자 처리
        String[] patterns = new String[fileNum];
        
        // 모든 패턴을 입력받음
        for (int i = 0; i < fileNum; i++) {
            patterns[i] = sc.nextLine();
        }
        
        int patternLength = patterns[0].length();
        
        // 최종 패턴을 저장할 배열
        char[] finalPattern = new char[patternLength];
        
        // 각 위치에서 문자를 비교
        for (int i = 0; i < patternLength; i++) {
            char currentChar = patterns[0].charAt(i);
            boolean isSame = true;
            for (int j = 1; j < fileNum; j++) {
                if (patterns[j].charAt(i) != currentChar) {
                    isSame = false;
                    break;
                }
            }
            if (isSame) {
                finalPattern[i] = currentChar;
            } else {
                finalPattern[i] = '?';
            }
        }
        
        // 최종 패턴을 출력
        System.out.println(new String(finalPattern));
        
        sc.close();
    }
}
