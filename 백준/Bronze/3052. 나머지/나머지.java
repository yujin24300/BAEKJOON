import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] X = new int[10];  // 정수 10개 입력받을 배열
        int[] R = new int [10]; // 입력받은 정수를 42로 나눈 나머지 값을 넣는 배열
        int flag = 0;
        int cnt = 0;

        for(int i = 0; i < X.length; i++) {
            X[i] = sc.nextInt();
            R[i] = X[i] % 42;
        }

        for(int i = 0; i < X.length; i++){
            flag = 0;
           for(int j = 0;  j < i; j++){
               if(R[i] == R[j]){
                   flag = 1;
                   break;
               }
           }
           if(flag == 0)
               cnt++;
        }

        System.out.println(cnt);
    }
}