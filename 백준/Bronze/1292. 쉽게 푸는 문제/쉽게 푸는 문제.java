import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		sc = new Scanner(src);
		int arr[] = new int[500600];
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int idx=0;
		int sum=0;
//바깥에서 1부터 1000까지 값을 불러옴
		out : for(int i=1; i<=1000; i++) {
//i가 3이라면 0~2까지 총 3번 값이 들어가도록 반복해줌.
			for(int j=0; j<i; j++) {
				idx++;
				arr[idx]=i;
				if(idx>=A && idx<=B) {
					sum+=arr[idx];
				}
				if(idx==B) {
					break out;
				}
			}
		}
		System.out.println(sum);
	}
	private static String src = "3 7";
}