import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        while(sc.hasNextInt()){ //scanner객체에 입력값이 int값일 때만 ture를 반환
            a = sc.nextInt();
            b = sc.nextInt();

            System.out.println(a+b);
        }
    }
}