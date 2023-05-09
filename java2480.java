import java.util.Scanner;
public class java2480 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int prise = 0;
        if(a==b && a==c){
            prise = (a*1000)+10000;
            System.out.println(prise);
        }
        else{
            if(a==b){
                prise = 1000+(a*100);
                System.out.println(prise);
            }
            if(a==c){
                prise = 1000+(a*100);
                System.out.println(prise);
            }
            if(c==b){
                prise = 1000+(c*100);
                System.out.println(prise);
            }
        }
        if (a!=b && b!=c && a!=c){
            if(a>b && a>c){
                prise = a*100;
                System.out.println(prise);
            }
            else if(b>a && b>c){
                prise = b*100;
                System.out.println(prise);
            }
            else if(c>a && c>b){
                prise = c*100;
                System.out.println(prise);
            }
        }
    }
}
