import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        while(a != 0 && b != 0 && c != 0){
            if((a*a + b*b) == c*c || (a*a + c*c) == b*b || (b*b + c*c) == a*a)
                System.out.println("right");
            else
                System.out.println("wrong");

            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
        }
    }
}