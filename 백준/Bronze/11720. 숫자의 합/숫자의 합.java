import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sum = 0;
        
        String S = sc.next();
        char[] arr = S.toCharArray();

        for(int i : arr)
            sum += i - '0';

        System.out.println(sum);
    }
}