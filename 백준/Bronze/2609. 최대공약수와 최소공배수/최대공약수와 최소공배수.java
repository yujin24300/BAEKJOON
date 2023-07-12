import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int min, max;

        if(a < b){
            min = a;
            max = b;
        }
        else {
            max = a;
            min = b;
        }

        for(int i = min; i > 0; i--){
            if(max % i == 0 && min % i == 0){
                System.out.println(i);
                break;
            }
        }

        for(int i = 1; ; i++){
            if((max * i) % min == 0){
                System.out.println(max * i);
                break;
            }
        }
    }
}