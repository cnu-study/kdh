import java.util.*;

public class java2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        StringBuffer asb = new StringBuffer(a);
        String ar = asb.reverse().toString();
        StringBuffer bsb = new StringBuffer(b);
        String br = bsb.reverse().toString();

        int an = Integer.parseInt(ar);
        int bn = Integer.parseInt(br);

        if(an > bn) {
            System.out.println(ar);
        } else {
            System.out.println(br);
        }
    }
}
