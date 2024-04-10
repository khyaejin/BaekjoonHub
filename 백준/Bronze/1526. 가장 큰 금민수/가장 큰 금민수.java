import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int gms = num; gms >= 4; gms--) {
            boolean isGMS = true;
            String gmsStr = String.valueOf(gms);
            for (int i = 0; i < gmsStr.length(); i++) {
                if (gmsStr.charAt(i) != '4' && gmsStr.charAt(i) != '7') {
                    isGMS = false;
                    break;
                }
            }
            if (isGMS) {
                System.out.println(gms);
                break;
            }
        }

        sc.close();
    }
}
