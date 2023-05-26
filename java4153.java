import java.util.Scanner;

public class java4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            a = a * a;
            b = b * b;
            c = c * c;

            if(a > b && a > c) {
                if (b + c == a) {
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            } else if(b > a && b > c) {
                if (a + c == b) {
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            } else if(c > a && c > b){
                if (a + b == c) {
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            } else if(a == 0 && b == 0 && c == 0) break;
        }
    }
}
