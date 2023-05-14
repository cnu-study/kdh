import java.util.Scanner;

public class java2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // 개행 문자를 읽어서 버림
        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            int t = str.charAt(0) - '0';
            for (int j = 0; j < str.length() - 2; j++) {
                for (int k = 0; k < t; k++) {
                    System.out.print(str.charAt(j + 2));
                }
            }
            System.out.println();
        }
    }
}

