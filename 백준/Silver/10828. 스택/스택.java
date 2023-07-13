import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            String input = sc.next();

            switch (input) {
                case "push":
                    int x = sc.nextInt();
                    stack.push(x);
                    break;

                case "pop":
                    if (stack.isEmpty())
                        sb.append(-1).append('\n');
                        //System.out.println(-1);
                    else
                        sb.append(stack.pop()).append('\n');
                        //System.out.println(stack.pop());
                    break;

                case "size":
                    sb.append(stack.size()).append('\n');
                    //System.out.println(stack.size());
                    break;

                case "empty":
                    if (stack.isEmpty())
                        sb.append(1).append('\n');
                        //System.out.println(1);
                    else
                        sb.append(0).append('\n');
                        //System.out.println(0);
                    break;

                case "top":
                    if (stack.isEmpty())
                        sb.append(-1).append('\n');
                        //System.out.println(-1);
                    else
                        sb.append(stack.peek()).append('\n');
                        //System.out.println(stack.peek());
                    break;
            }
        }
        System.out.println(sb);
    }
}