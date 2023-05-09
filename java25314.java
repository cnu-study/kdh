import java.lang.String;
import java.util.Scanner;
public class java25314 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String text1 = "";
        for(int L = i/4; L>0; L--){
            text1 = text1 + "long ";
        }
        text1 = text1 + "int";
        System.out.println(text1);
    }
}