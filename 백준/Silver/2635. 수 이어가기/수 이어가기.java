import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0, max_cnt = 0, n1, n2;
        int[] x = new int[30000];
        int[] y = new int[30000];

        for(int i = 0; i < n + 1; i++){
            cnt = 0;
            x[cnt++] = n;
            x[cnt++] = i;
            n1 = n;
            n2 = i;
            while(n2 >= 0){
                n1 -= n2;
                x[cnt++] = n1;
                n1 = x[cnt - 2];
                n2 = x[cnt - 1];
            }

            if(max_cnt < cnt - 1){
                max_cnt = cnt - 1;
                for(int j = 0; j < max_cnt; j++)
                    y[j] = x[j];
            }
        }

        System.out.println(max_cnt);
        for(int i = 0; i < max_cnt; i++)
            System.out.print(y[i] + " ");
    }

}
