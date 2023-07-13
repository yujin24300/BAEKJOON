import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int n = sc.nextInt();
        int x = 0;

        for(int i = 0; i < n; i++) {
            String input = sc.next();

            switch (input) {
                case "push":
                    x = sc.nextInt();
                    q.add(x);
                    break;

                case "pop":
                    if (q.isEmpty())
                        sb.append(-1).append('\n');
                        //System.out.println(-1);
                    else
                        sb.append(q.remove()).append('\n');
                        //System.out.println(q.remove());
                    break;

                case "size":
                    sb.append(q.size()).append('\n');
                    //System.out.println(q.size());
                    break;

                case "empty":
                    if (q.isEmpty())
                        sb.append(1).append('\n');
                        //System.out.println(1);
                    else
                        sb.append(0).append('\n');
                        //System.out.println(0);
                    break;

                case "front":
                    if (q.isEmpty())
                        sb.append(-1).append('\n');
                        //System.out.println(-1);
                    else
                        sb.append(q.peek()).append('\n');
                        //System.out.println(q.peek());
                    break;

                case "back":
                    if (q.isEmpty())
                        sb.append(-1).append('\n');
                        //System.out.println(-1);
                    else
                        sb.append(x).append('\n');
                    //System.out.println(x);
                    break;
            }
        }
        System.out.println(sb);
    }
}