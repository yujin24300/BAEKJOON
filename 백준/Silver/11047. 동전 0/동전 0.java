import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] coin = new int[n];
        int cnt = 0;

        for(int i = 0 ; i < n; i++)
            coin[i] = sc.nextInt();

        for(int i = n - 1; i >= 0; i--){
            if (k >= coin[i]) {
                cnt += (k / coin[i]);
                k = k % coin[i];
            }
            if(k == 0)
                break;
        }

        System.out.println(cnt);
    }
}