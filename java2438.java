import java.util.*;

public class java2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sum = 0;
        int exam = sc.nextInt();
        float[] score = new float[exam];
        for (int i = 0; i<exam; i++){
            score[i] = sc.nextFloat();
        }
        float len = score.length;
        int leni = score.length;
        Arrays.sort(score);
        for (int j = 0; j<exam; j++){
            score[j] = (score[j]/score[leni-1])*100;
        }
        for (int k = 0; k<exam; k++){
            sum += score[k];
        }
        System.out.println(sum/len);
    }
}
