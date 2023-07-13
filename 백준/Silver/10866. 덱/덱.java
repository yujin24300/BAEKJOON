import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int n = sc.nextInt();
        int x = 0;

        for(int i = 0; i < n; i++) {
            String input = sc.next();

            switch (input) {
                case "push_front":
                    x = sc.nextInt();
                    dq.addFirst(x);
                    break;

                case "push_back":
                    x = sc.nextInt();
                    dq.addLast(x);
                    break;

                case "pop_front":
                    if (dq.isEmpty())
                        sb.append(-1).append('\n');
                        //System.out.println(-1);
                    else
                        sb.append(dq.pollFirst()).append('\n');
                        //System.out.println(dq.pollFirst());
                    break;

                case "pop_back":
                    if (dq.isEmpty())
                        sb.append(-1).append('\n');
                        //System.out.println(-1);
                    else
                        sb.append(dq.pollLast()).append('\n');
                    //System.out.println(dq.pollLast());
                    break;

                case "size":
                    sb.append(dq.size()).append('\n');
                    //System.out.println(dq.size());
                    break;

                case "empty":
                    if (dq.isEmpty())
                        sb.append(1).append('\n');
                        //System.out.println(1);
                    else
                        sb.append(0).append('\n');
                        //System.out.println(0);
                    break;

                case "front":
                    if (dq.isEmpty())
                        sb.append(-1).append('\n');
                        //System.out.println(-1);
                    else
                        sb.append(dq.peekFirst()).append('\n');
                        //System.out.println(dq.peekFirst());
                    break;

                case "back":
                    if (dq.isEmpty())
                        sb.append(-1).append('\n');
                        //System.out.println(-1);
                    else
                        sb.append(dq.peekLast()).append('\n');
                    //System.out.println(dq.peekLast());
                    break;
            }
        }
        System.out.println(sb);
    }
}