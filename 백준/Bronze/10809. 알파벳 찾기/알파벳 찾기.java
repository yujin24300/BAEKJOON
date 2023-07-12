import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        String S = sc.next();
        char[] X = S.toCharArray();

        for(int i = 0; i < X.length; i++){
            if(arr[X[i] - 'a'] == -1)
                arr[X[i] - 'a'] = i;
        }

        for(int i : arr)
            System.out.print(i + " ");
    }
}