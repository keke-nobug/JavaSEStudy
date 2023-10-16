package com.powernode.test.day28;

import java.util.*;

/**
 * ClassName: CollectionTest
 * Package: com.powernode.homework.day28
 * Description:
 * Author: qzk
 * Create 2023/9/10 0:24
 * Version: 1.0
 */
public class CollectionTest {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();//有序可重复
        integerArrayList.add(1);
        integerArrayList.add(1);
        integerArrayList.add(3);
        integerArrayList.add(4);
        integerArrayList.add(5);
        integerArrayList.add(6);

        integerArrayList.remove(5);
        Iterator<Integer> it = integerArrayList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("===============================");

        HashSet<Integer> integerHashSet = new HashSet<>();//无序不可重复
        integerHashSet.add(7);
        integerHashSet.add(8);
        integerHashSet.add(9);
        integerHashSet.add(10);
        integerHashSet.add(11);
        integerHashSet.add(12);
        integerHashSet.add(10);


        integerHashSet.remove(12);
        Iterator<Integer> it2 = integerHashSet.iterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }
        System.out.println(integerHashSet.size());

        System.out.println("===============================");

        ArrayList<Integer> list = new ArrayList<>(integerHashSet); //set集合转为list集合！
        for (Integer i:list
             ) {
            System.out.println(i);
        }


        System.out.println("===============================");

        Collection c = new ArrayList();
        // 注意：此时获取的迭代器，指向的是那是集合中没有元素状态下的迭代器。
        // 一定要注意：集合结构只要发生改变，迭代器必须重新获取。
        // 当集合结构发生了改变，迭代器没有重新获取时，调用next()方法时：java.util.ConcurrentModificationException
//        Iterator it3 = c.iterator();
        // 添加元素
        c.add(1); // Integer类型
        c.add(2);
        c.add(3);
        // 获取迭代器
        Iterator it3 = c.iterator();
        while(it3.hasNext()){
            // 编写代码时next()方法返回值类型必须是Object。
//             Integer i = it3.next();
            Object obj = it3.next();
            System.out.println(obj);
        }


        System.out.println("===============================");
        HashMap<Integer, String> hashMap = new HashMap<>();//key部分无序不可重复
        hashMap.put(1,"a");
        hashMap.put(20,"b");
        hashMap.put(333,"c");
        hashMap.put(44,"d");
        hashMap.put(5,"e");
        hashMap.put(130,"e");
        hashMap.put(91,"e");
        hashMap.put(82,"e");
        hashMap.put(74,"e");
        hashMap.put(666,"e");
        hashMap.put(111,"e");
        hashMap.put(17,"e");

        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
        for (Map.Entry<Integer, String> node: entries
        ){
            System.out.println(node.getKey()+"="+node.getValue());
        }
        System.out.println(hashMap.size());

        System.out.println("===============================");

        TreeMap<Integer, String> treeMap = new TreeMap<>();//有序不可重复，但可排序！
        treeMap.put(23,"a");
        treeMap.put(3,"b");
        treeMap.put(23,"aa");
        treeMap.put(28,"c");
        treeMap.put(1,"d");
        treeMap.put(218,"ag");
        treeMap.put(343,"g");

        Set<Map.Entry<Integer, String>> entrySet = treeMap.entrySet();
        for (Map.Entry<Integer,String> node : entrySet
             ) {
            System.out.println(node.getKey()+"="+node.getValue());

        }


        /*
        * 两种方法，方法一：种自定义类的时候实现Comparable并重写compareTo方法，注意使用泛型
        * 方法二：使用匿名内部类的方式，new TreeSet 时 传入一个比较器对象Comparator 并重写 compare 方法
        * 并且优先级：是new对象时传入的比较器优先级高
        * */
        TreeSet<User> userTreeSet = new TreeSet<>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o2.age - o1.age;
            }
        });
        User u1 = new User(13);
        User u2 = new User(201);
        User u3 = new User(19);
        User u4 = new User(17);
        User u5 = new User(113);
        User u6 = new User(12);
        //必须重写compareTo方法 才能添加元素！
        userTreeSet.add(u1);
        userTreeSet.add(u2);
        userTreeSet.add(u3);
        userTreeSet.add(u4);
        userTreeSet.add(u5);
        userTreeSet.add(u6);

        for (User u :userTreeSet) {
            System.out.println(u.age);
        }

        if (args == null) {

        }

    }
}

class User implements Comparable<User> {
    public int age;


    public User() {
    }

    public User(int age) {
        this.age = age;
    }

    @Override


    public int compareTo(User o) {
        return this.age - o.age;
    }
}
