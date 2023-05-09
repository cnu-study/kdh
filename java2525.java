import java.util.Scanner;
public class java2525 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();

        int sum = 0;
        h = h*60;
        sum = h + m + c;

        h = sum/60;
        m = sum%60;

        if(h<=23) {
            System.out.println(h + " " + m);
        }
        else if(h>=24 && h<48) {
            h = h-24;
            System.out.println(h + " " + m);
        }
        else if(h>=48 && h<72) {
            h = h-48;
            System.out.println(h + " " + m);
        }
        else if(h>=72 && h<96) {
            h = h-72;
            System.out.println(h + " " + m);
        }
        else if(h>=96 && h<120) {
            h = h-96;
            System.out.println(h + " " + m);
        }
        else if(h>=120 && h<144) {
            h = h-120;
            System.out.println(h + " " + m);
        }
    }
}
