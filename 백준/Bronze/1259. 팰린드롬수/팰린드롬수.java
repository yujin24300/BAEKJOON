import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m, n1;

        while(n != 0){
            n1 = n;
            m = 0;
            while(n1 > 0){
                m = m * 10 + n1 % 10;
                n1 /= 10;
            }

            if(n == m)
                System.out.println("yes");
            else
                System.out.println("no");

            n = sc.nextInt();
        }
    }
}