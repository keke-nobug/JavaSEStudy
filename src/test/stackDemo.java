package test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @BelongsProject: JavaSEStudy
 * @BelongsPackage: test
 * @Author: qzk
 * @CreateTime: 2024/11/12 11:09
 * @Description: TODO
 * @Version: 1.0
 */
public class stackDemo {
    public static void main(String[] args) {
        // Stack<Integer> stack = new Stack<>();
        // 用 Deque 实现,push 和 pop 相当于addFirst 和 removeFirst
        // Deque<Integer> stack = new ArrayDeque<>();
        Deque<Character> stack = new LinkedList<>();
        
        String s = "([])";

        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == '(' || c == '[' || c == '{') {
                stack.addFirst(c);
            }
            else {
                char temp = stack.pop();
                if (c == ')') {
                    if (temp == '(') {
                        continue;
                    }
                    else System.out.println("()2");;
                } else if (c == ']') {
                    if (temp == '['){
                        continue;
                    }
                    else System.out.println("[]2");;
                }
                else {
                    if (temp == '{') {
                        continue;
                    }
                    else System.out.println("{}2");;
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println(1);
        }
        else System.out.println(2);
    }
}
