import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] x = new int[n];
        int result = 0;
        for(int i = 0; i < n; i++)
            x[i] = sc.nextInt();

        for(int i = 0; i < n - 2; i++){
            for(int j = i + 1; j < n - 1; j++){
                for(int k = j + 1; k < n; k++){
                    if((x[i] + x[j] + x [k]) > result && (x[i] + x[j] + x [k]) <= m)
                        result = x[i] + x[j] + x [k];
                }
            }
        }

        System.out.println(result);
    }

}