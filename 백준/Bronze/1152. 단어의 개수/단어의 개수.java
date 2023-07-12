import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim(); //양쪽 공백 제거

        if(str.equals(""))
            System.out.println(0);
        else
            System.out.println(str.split(" ").length);
    }
}
