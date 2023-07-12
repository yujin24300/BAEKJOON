import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
        int cnt = 0;

        for(int i = 0; i < N; i++){
            int Y = sc.nextInt();

            if(Y < X)
                System.out.print(Y + " ");
        }

    }
}