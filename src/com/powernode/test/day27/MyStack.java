package com.powernode.test.day27;

/**
 * ClassName: MyStack
 * Package: com.powernode.homework.day27
 * Description:
 * Author: qzk
 * Create 2023/9/8 14:24
 * Version: 1.0
 */
/*
    编写程序，使用一维数组，模拟栈数据结构。方法里使用自定义异常
    要求：
        1、这个栈可以存储java中的任何引用类型的数据。
        2、在栈中提供push方法模拟压栈。（栈满了，要有提示信息。）
        3、在栈中提供pop方法模拟弹栈。（栈空了，也有有提示信息。）
        4、编写测试程序，new栈对象，调用push pop方法来模拟压栈弹栈的动作。
        5、假设栈的默认初始化容量是10.（请注意无参数构造方法的编写方式。）
 */
public class MyStack {
    private Object[] elements;
    private int index;

    public MyStack() {
        elements = new Object[10];
        index = -1;
    }

    public MyStack(Object[] object, int index) {
        this.elements = object;
        this.index = index;
    }
    public void push(Object obj) throws MyStackException {
        if (index >= elements.length - 1){
            MyStackException myStackException = new MyStackException("压栈失败，栈已满！！！");
            throw myStackException;
        }

        index++;
        elements[index] = obj;
        // 在声明一次：所有的System.out.println()方法执行时，如果输出引用的话，自动调用引用的toString()方法。
        System.out.println("压栈" + obj + "元素成功，栈帧指向" + index);
    }

    public void pop() throws MyStackException {
        if(index < 0){
            throw new MyStackException("弹栈失败，栈已空！！！");
        }
        // 程序能够执行到此处说明栈没有空。
        System.out.print("弹栈" + elements[index] + "元素成功，");
        // 栈帧向下移动一位。
        index--;
        System.out.println("栈帧指向" + index);
    }

}
