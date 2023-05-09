import java.util.*;

public class java2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> Q = new LinkedList<>();
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            Q.add(i);
        }
        while(n!=1){
            Q.remove();
            Q.add(Q.poll());
            n -= 1;
        }
        System.out.print(Q.peek());
    }
}
