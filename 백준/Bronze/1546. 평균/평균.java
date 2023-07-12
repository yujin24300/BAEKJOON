import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] score = new int[n];
        double[] score_n = new double[n];
        double sum = 0;
        int m = 0;

        for(int i = 0; i < n; i++){
            score[i] = sc.nextInt();
            if(m < score[i])
                m = score[i];
        }

        for(int i = 0; i < n; i++) {
            score_n[i] = (double)score[i] / m * 100;
            sum += score_n[i];
        }

        System.out.println(sum / n);
    }
}