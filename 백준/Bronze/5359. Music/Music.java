import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int datasets = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        for (int i = 0; i < datasets; i++) {
            String[] params = scanner.nextLine().split(" ");
            int n = Integer.parseInt(params[0]);
            int m = Integer.parseInt(params[1]);
            int c = Integer.parseInt(params[2]);
            String[] volumes = scanner.nextLine().split(" ");
            int[] volumeArray = new int[n];
            for (int j = 0; j < n; j++) {
                volumeArray[j] = Integer.parseInt(volumes[j]);
            }
            int silenceIntervals = countSilenceIntervals(volumeArray, m, c);
            System.out.println(silenceIntervals);
        }
        scanner.close();
    }

    public static int countSilenceIntervals(int[] volumeArray, int m, int c) {
        int count = 0;
        for (int i = 0; i <= volumeArray.length - m; i++) {
            int[] subArray = new int[m];
            System.arraycopy(volumeArray, i, subArray, 0, m);
            if (isSilence(subArray, c)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isSilence(int[] subArray, int c) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : subArray) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min <= c;
    }
}
