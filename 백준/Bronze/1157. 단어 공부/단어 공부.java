import java.util.Scanner;

class MostUsedAlphabet {
	private int [] alphaCounts = new int [26]; //단어가 몇개 들어있는지 저장하는 배열
	private String word; //단어 입력받을 변수
	private boolean duplication = false; //중복 확인을 위한 변수
  	private int mostUsedAlpha = 0; //가장 많이 사용된 알파벳

    public void run() {
    	Scanner sc = new Scanner(System.in);
    	//입력
    	word = sc.next();
    	
    	//알파벳별 사용 횟수 세기
    	countMostUsedAlphabet();

      	//가장 많이 사용된 알파벳 판별
    	findMostUsedAlphabet(word);
    	
    	//출력
    	printMostUsedAlphabet();
    	
    	sc.close();

    }
	//알파벳별 사용 횟수 세기
    private void countMostUsedAlphabet() {
      	for(int i = 65; i<=90; i++) { // 'A' = 65, 'Z' = 90
      		int count = 0;
      		for(int j = 0; j<word.length(); j++){
      			char charAlpha = word.charAt(j);
      			int ascciAlpha = (int)charAlpha;
      			
      			if(i == ascciAlpha|| (i+32) == ascciAlpha) { //'a' = 97
      				count++;
      			}
      		}
      		alphaCounts[(i-65)] = count;
      	}
    }
    
  	//가장 많이 사용된 알파벳 판별
    private void findMostUsedAlphabet(String alpha) {
    	int max = 0;
    	
      	for(int i = 0; i<26; i++) {
      		if(max < alphaCounts[i]) {
      			max = alphaCounts[i];
      			mostUsedAlpha = i + 65; // 'A' = 65
      	      	duplication = false; //중복이 아님 (중복인 후에 더 큰 수가 나타나도 중복 아님)
      		}
      		else if(max == alphaCounts[i]) {
      			duplication = true; //중복
      		}
      	}
    }
    
    private void printMostUsedAlphabet() {
    	if(duplication) {
    		System.out.println("?");
    	}
    	else {
    		System.out.println((char)mostUsedAlpha);
    	}
    }
}


public class Main {

    public static void main(String[] args) {
    	MostUsedAlphabet mostAlpha= new MostUsedAlphabet();
    	mostAlpha.run();
    }
}
