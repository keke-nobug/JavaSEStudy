package test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @BelongsProject: JavaSEStudy
 * @BelongsPackage: test
 * @Author: qzk
 * @CreateTime: 2024/9/28 22:56
 * @Description: TODO
 * @Version: 1.0
 */
public class StackDemo {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> queue = new LinkedList<>();
        queue.addFirst(1);

        Queue<Integer> queue1 = new LinkedList<>();

        stack.push(1);

        System.out.println(4>>1);
        System.out.println(4>>>1);

    }
}
