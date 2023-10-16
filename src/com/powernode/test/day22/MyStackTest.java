package com.powernode.test.day22;

import java.util.Random;

/**
 * ClassName: MyStackTest
 * Package: com.powernode.homework.day22
 * Description:
 * Author: qzk
 * Create 2023/9/5 22:25
 * Version: 1.0
 */
public class MyStackTest {
    public static void main(String[] args) {
        String s = "123";
        String[] str= new String[5];
        MyStack myStack = new MyStack(str,5);
        myStack.push(s);
        myStack.printer();

        int i = new Random().nextInt(2);
        System.out.println(i);
        new MyStackTest().contains();
    }
    // 在类里面写静态方法 直接方法名就能调用 本类名可以省略
    public  boolean contains(){
        return true;
    };
}

