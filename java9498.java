import java.util.Scanner;
public class java9498 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a>= 90) {
            System.out.println("A");
        }
        if (a>=80 && a<90) {
            System.out.println("B");
        }
        if (a>=70 && a<80) {
            System.out.println("C");
        }
        if (a>=60 && a<70) {
            System.out.println("D");
        } else if (a<60) {
            System.out.println("F");
        }

    }
}