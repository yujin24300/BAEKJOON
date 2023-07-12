import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x, cnt = 0, flag = 0;

        for(int i = 0; i < n; i++) {
            x = sc.nextInt();
            flag = 0;
            for(int j = 2; j < x; j++){
                if(x % j == 0){
                    flag = 1;
                    break;
                }
            }

            if(x != 1 && flag == 0)
                cnt++;
        }

        System.out.println(cnt);
    }
}