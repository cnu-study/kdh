import java.util.*;

public class java4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] score;

        int c = sc.nextInt();

        for (int i = 0; i < c; i++) {
            int n = sc.nextInt();
            score = new int[n];

            double sum = 0;

            for (int j = 0; j < n; j++) {
                int val = sc.nextInt();
                score[j] = val;
                sum += val;
            }

            double mean = sum / n;
            double count = 0;

            for (int j = 0; j < n; j++) {
                if(score[j] > mean) count++;
            }
            System.out.printf("%.3f%%\n",(count/n)*100);
        }
    }
}
