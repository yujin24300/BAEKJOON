import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        char[] arr = S.toCharArray();
        int n = sc.nextInt();

        System.out.println(arr[n - 1]);

    }
}
