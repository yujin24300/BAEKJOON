import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int total = 0, score = 0;

        for(int i = 0; i < n; i++){
            total = 0;
            score = 0;
            String S = sc.next();
            char[] arr = S.toCharArray();

            for(int j = 0; j < arr.length; j++){
                if(arr[j] == 'X'){
                    score = 0;
                }
                else {
                    score++;
                    total += score;
                }
            }

            System.out.println(total);
        }
    }
}