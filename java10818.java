import java.util.*;

public class java10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = -1000000;
        int min = 1000000;
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            if (a>max) max = a;
            if (a<min) min = a;
        }
        System.out.printf("%d %d",min,max);
    }
}
