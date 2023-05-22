import java.util.HashSet;
import java.util.Scanner;
public class java3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        HashSet <Integer> h = new HashSet<Integer>(); //해쉬집합 선언

        for (int i = 0; i < 10; i++) {
            h.add(sc.nextInt() % 42); //set에 중복되는 값을 제외한 값 삽입
        }
        System.out.println(h.size()); //set의 사이즈 출력
    }
}
