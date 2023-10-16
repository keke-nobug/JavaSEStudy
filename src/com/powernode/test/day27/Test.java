package com.powernode.test.day27;

/**
 * ClassName: Test
 * Package: com.powernode.homework.day27
 * Description:
 * Author: qzk
 * Create 2023/9/8 14:36
 * Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        try {
            myStack.push("1");
            myStack.push("1");
            myStack.push("1");
            myStack.push("1");
            myStack.push("1");
            myStack.push("1");
            myStack.push("1");
            myStack.push("1");
            myStack.push("1");
            myStack.push("1");

            myStack.push("1");
        } catch (MyStackException e) {
            throw new RuntimeException(e);
//            System.out.println(e.getMessage());
        }

        try {
            myStack.pop();
            myStack.pop();
            myStack.pop();
            myStack.pop();
            myStack.pop();
            myStack.pop();
            myStack.pop();
            myStack.pop();
            myStack.pop();
            myStack.pop();

            myStack.pop();
        } catch (MyStackException e) {
            throw new RuntimeException(e);
        }
    }
}
