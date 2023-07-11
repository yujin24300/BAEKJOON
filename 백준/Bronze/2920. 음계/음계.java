import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] X = new int[8];
        String output = null;

        for(int i = 0; i < X.length; i++)
            X[i] = sc.nextInt();

        for(int i = 0; i < X.length - 1; i++){
            if(X[i + 1] == X[i] + 1)
                output = "ascending";
            else if(X[i + 1] == X[i] - 1)
                output = "descending";
            else{
                output = "mixed";
                break;
            }
        }

        System.out.println(output);
    }
}
