package Everything;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * boj 4949 : 균형잡힌 세상
 * 스택
 */

public class b4949 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        while (true) {
            boolean TF = true;
            String s = br.readLine();
            if (".".equals(s)) {
                break;
            }

            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(' || s.charAt(i) == '[') {
                    stack.push(s.charAt(i));
                } else if (s.charAt(i) == ')' || s.charAt(i) == ']') {
                    if (!stack.isEmpty() && stack.peek().equals('(') && s.charAt(i) == ')') {
                        stack.pop();
                    } else if (!stack.isEmpty() && stack.peek().equals('[') && s.charAt(i) == ']') {
                        stack.pop();
                    } else {
                        TF = false;
                    }
                }
            }

            if (!s.endsWith(".") || !stack.isEmpty()) {
                TF = false;
            }

            if (TF) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

    }
}
