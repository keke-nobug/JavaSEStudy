package com.powernode.test.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * ClassName: TimerTest
 * Package: com.powernode.test.thread
 * Description:
 * Author: qzk
 * Create 2023/9/12 17:23
 * Version: 1.0
 */
public class TimerTest {
    public static void main(String[] args) {

        new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                return null;
            }
        });
    }

    class MyThread extends Thread {

        @Override
        public void run() {
            System.out.println("分支线程run");
        }
    }
}
