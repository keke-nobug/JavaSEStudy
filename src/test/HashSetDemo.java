package test;

import java.util.HashSet;

/**
 * @BelongsProject: JavaSEStudy
 * @BelongsPackage: test
 * @Author: qzk
 * @CreateTime: 2024/4/14 1:06
 * @Description: TODO
 * @Version: 1.0
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        System.out.println(hashSet.add(1));
        System.out.println(hashSet.size());

    }
}
