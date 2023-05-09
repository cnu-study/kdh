import java.util.Scanner;
public class java2884 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if(h==0){
            if(m>=45) {
                m = m - 45;
                System.out.println(h+" "+m);
            }
            else if(m<45) {
                h = 23;
                m = m+15;
                System.out.println(h+" "+m);
            }
        }
        else {
            if(m>=45) {
                m = m - 45;
                System.out.println(h+" "+m);
            }
            else if(m<45) {
                h = h-1;
                m = m+15;
                System.out.println(h+" "+m);
            }
        }
    }
}
