import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            if(N % H == 0)
                System.out.printf("%d%02d\n", H, N / H);
            else
                System.out.printf("%d%02d\n", (N % H), (N / H + 1));
        }

    }
}