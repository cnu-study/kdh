import java.util.Scanner;
public class java25304 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int sum = 0;
        for(int item = sc.nextInt(); item>0; item--)
        {
            int price = sc.nextInt();
            int count = sc.nextInt();
            sum = sum + (price * count);
        }
        if(sum == total){
            System.out.println("Yes");
        }
        if(sum != total){
            System.out.println("No");
        }
    }
}