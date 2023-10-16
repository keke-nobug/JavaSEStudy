package com.powernode.test.thread;

/**
 * ClassName: ThreadTest01
 * Package: com.powernode.test.thread
 * Description:
 * Author: qzk
 * Create 2023/9/12 11:21
 * Version: 1.0
 */
public class ThreadTest01 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("分支线程：" + i);
                }
            }
        });
        thread.start();

        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程："+ i);
        }
    }
}
