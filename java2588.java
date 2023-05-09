import java.util.Scanner;
public class java2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int b3 = b/100;
        int b2 = b%100;
        int b22 = b2/10;
        int b1 = b%10;
        System.out.println(b1*a);
        System.out.println(b22*a);
        System.out.println(b3*a);
        System.out.println(a*b);
    }
}