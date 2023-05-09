import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class java2440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 0; i<=a; i++){
            for (int j = i+1; j<=a ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}