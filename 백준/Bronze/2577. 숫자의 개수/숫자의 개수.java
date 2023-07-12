import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] n = new int[10];

        for(int i = 0 ; i < n.length; i++)
            n[i] = 0;

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int x = a * b * c;

        while(x > 0){
            n[x % 10]++;
            x /= 10;
        }

        for(int i : n)
            System.out.println(i);
    }
}
