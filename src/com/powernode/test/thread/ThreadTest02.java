package com.powernode.test.thread;

/**
 * ClassName: ThreadTest02
 * Package: com.powernode.test.thread
 * Description:
 * Author: qzk
 * Create 2023/9/12 23:45
 * Version: 1.0
 */
public class ThreadTest02 {
    public static void main(String[] args) {
        System.out.println("???");
        MyRunnable myRunnable = new MyRunnable();//创建一个可运行的对象，用于下面传参
        Thread t1 = new Thread(myRunnable, "thread01");//新建一个线程对象，并且命名为thread01
        System.out.println(t1.getName());

        t1.start();

    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("这是分支线程");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("睡眠10秒后输出");
    }
}
