package test;

import java.util.HashMap;

/**
 * @BelongsProject: JavaSEStudy
 * @BelongsPackage: test
 * @Author: qzk
 * @CreateTime: 2024/4/18 20:44
 * @Description: TODO
 * @Version: 1.0
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('a', 1);
        hashMap.put('b', 1);
        hashMap.put('c', 1);

        boolean flag1 = hashMap.containsKey('a');
        if(flag1) System.out.println("存在key为 a");

        hashMap.remove('a');
        boolean flag2 = hashMap.containsKey('a');
        if(!flag2) System.out.println("不存在key为 a");
    }
}
