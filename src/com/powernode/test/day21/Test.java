package com.powernode.test.day21;

/**
 * ClassName: Test
 * Package: com.powernode.homework.day21
 * Description:
 * Author: qzk
 * Create 2023/9/4 22:45
 * Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        InsertDrawable mouse = new Mouse();
        InsertDrawable keyboard = new Keyboard();
        Computer computer1 = new Computer(mouse);
        computer1.insert();
        Computer computer2 = new Computer(keyboard);
        computer2.insert();

    }
}
