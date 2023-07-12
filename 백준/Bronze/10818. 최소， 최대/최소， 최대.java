import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int max = -1000000, min = 1000000;

        for(int i = 0; i < N; i++){
            int a = sc.nextInt();

            if(max < a)
                max = a;
            if(min > a)
                min = a;
        }

        System.out.println(min + " " + max);
    }
}