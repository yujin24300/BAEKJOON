import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int R;
        String P;
        char[] arr;

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            R = sc.nextInt();
            P = sc.nextLine().trim();
            arr = P.toCharArray();

            for(int j = 0; j < arr.length; j++){
                for(int k = 0; k < R; k++){
                    System.out.print(arr[j]);
                }
            }
            System.out.println();
        }
    }
}
