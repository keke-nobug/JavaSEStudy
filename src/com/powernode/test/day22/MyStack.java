package com.powernode.test.day22;

/**
 * ClassName: MyStack
 * Package: com.powernode.homework.day22
 * Description:
 * Author: qzk
 * Create 2023/9/5 22:12
 * Version: 1.0
 */
public class MyStack {
    private Object[] objects;
    private int length;

    public Object[] getObjects() {
        return objects;
    }

    public void setObjects(Object[] objects) {
        this.objects = objects;
    }

    public MyStack(Object[] objects, int length) {
        this.objects = objects;
        this.length = length;
    }

    public MyStack() {
    }

    public void push(Object obj) {
        if (objects.length < 4) {
            objects[objects.length + 1] = obj;
        } else System.out.println("栈满！！！");
    }

    public void pop(Object obj) {
        if (objects.length >= 1) {
            objects[objects.length] = null;
        } else System.out.println("栈空！！！");
    }

    public void printer() {
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i] + "    ");
        }
    }

}
