import java.util.*;

public class java10773 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for (int i  = 0; i<a; i++){
            int n = sc.nextInt();
            if(n == 0){
                stack.pop();
            } else {
                stack.push(n);
            }
        }
        while(!stack.isEmpty()){
            sum += stack.peek();
            stack.pop();
        }
        System.out.print(sum);
    }
}
