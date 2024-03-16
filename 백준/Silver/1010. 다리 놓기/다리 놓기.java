import java.math.BigInteger;
import java.util.Scanner;

class Bridge {
    public void run() {
    	Scanner sc = new Scanner(System.in);
    	
    	int roof = sc.nextInt(); // 태스트케이스 입력받기
    	BigInteger [] numOfCases = new BigInteger [roof]; // 경우의 수 저장할 배열
    	
    	for(int a = 0; a<roof; a++) {
    		// m n 입력받기
    		int n = sc.nextInt();
    		int m = sc.nextInt();
    		
    		// 경우의 수 구하기 -> BigInteger 사용
    		BigInteger result = combination(m,n);
    		
    		// 경우의 수 배열에 저장하기
    		numOfCases[a] = result;
    	}
    	
    	// 배열의 모든 원소 출력
    	for(BigInteger bridge : numOfCases) { //for-each문 사용
    		System.out.println(bridge);
    	}
    	
    	sc.close();
    }
    
   private  BigInteger combination(int n, int k){ //nCk
	   BigInteger numerator = factorial(n); // 분자 : n!
	   BigInteger denominator = factorial(k).multiply(factorial(n-k)); // 분모 : k! * (n-k)!
	   return numerator.divide(denominator); // 조합: n! / (k! * (n-k)!)
    }
   
   private BigInteger factorial(int n) {
	   BigInteger result = BigInteger.ONE;
	   for(int i = 1; i<=n; i++) {
		   result = result.multiply(BigInteger.valueOf(i));
	   }
	   return result;
   }
}
    
public class Main {

    public static void main(String[] args) {
    	Bridge bridge = new Bridge();
    	bridge.run();
    }
}

// n<= m
// 다리끼리 겹쳐질 수 없음 -> m 다리 중 n개를 선택하면 순서는 자동으로 결정됨
// 경우의 수 골라라. 즉 mCn 조합.