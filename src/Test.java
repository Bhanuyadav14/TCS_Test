import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Stack;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            String S = br.readLine();

            int out_ = fun(S,T);
            System.out.println(out_);
            System.out.println("");
        }

        wr.close();
        br.close();
    }
    public static int fun(String S, int t) {

        Stack<Character> stack = new Stack<>();
        boolean isBalenced = true;

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
                continue;
            }

            if (stack.isEmpty()) {
                isBalenced = false;
                break;
            } else if (ch == '}') {
                if (stack.peek() == '{') {
                    stack.pop();
                } else {
                    isBalenced = false;
                    break;
                }
            } else if (ch == '(') {
                if (stack.peek() == ')') {
                    stack.pop();
                } else {
                    isBalenced = false;
                    break;
                }
            } else if (ch == '[') {
                if (stack.peek() == ']') {
                    stack.pop();
                } else {
                    isBalenced = false;
                    break;
                }
            }

        }



        if (!stack.isEmpty()) {
            isBalenced = false;
        }


        if (isBalenced) {
            System.out.println("0");
        } else {
            System.out.println("3");
        }

        return 0;
    }
}

