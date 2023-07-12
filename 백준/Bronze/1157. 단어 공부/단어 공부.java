import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String S = sc.next().toUpperCase();
        char[] arr = S.toCharArray();
        int[] cnt = new int[26];
        int max = 0;
        char ans = '?';

        for(int i : cnt)
            i = 0;

        for(int i : arr)
            cnt[i - 'A']++;

        for(int i  = 0; i < cnt.length; i++){
            if(max < cnt[i]){
                max = cnt[i];
                ans = (char)(i + 'A');
            }
            else if(max == cnt[i])
                ans = '?';
        }

        System.out.println(ans);
        
    }
}
