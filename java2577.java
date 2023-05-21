import java.util.*;

public class java2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mul = (sc.nextInt() * sc.nextInt() * sc.nextInt());

        String num = Integer.toString(mul);
        for (int i = 0; i<10; i++) {
            int cnt = 0;
            for (int j = 0; j<num.length(); j++) {
                if ((num.charAt(j)-'0')==i) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
