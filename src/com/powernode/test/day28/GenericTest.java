package com.powernode.test.day28;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ClassName: GenericTest
 * Package: com.powernode.homework.day28
 * Description:
 * Author: qzk
 * Create 2023/9/9 18:07
 * Version: 1.0
 */
public class GenericTest {
    public static void main(String[] args) {
        // 用泛型指定集合中存放的元素类型
//        ArrayList<Animal> animals = new ArrayList<Animal>();
        // 自动类型推断 钻石表达式 <> 不用指定类型
        ArrayList<Animal> animals = new ArrayList<>();
        Bird bird = new Bird();
        Dog dog = new Dog();
        animals.add(bird);
        animals.add(dog);
        // 用泛型指定迭代器中存放的元素类型
        Iterator<Animal> iterator = animals.iterator();
        while (iterator.hasNext()){
            iterator.next().move();
        }
    }
}

class Animal {
    public void move(){

    }
}

class Bird extends Animal{
    @Override
    public void move() {
        System.out.println("鸟儿在飞行！");
    }
}

class Dog extends Animal{
    @Override
    public void move() {
        System.out.println("小狗在跑步！");
    }
}