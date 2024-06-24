package test;

import java.util.HashMap;
import java.util.Map;

/**
 * @BelongsProject: JavaSEStudy
 * @BelongsPackage: test
 * @Author: qzk
 * @CreateTime: 2024/3/23 22:28
 * @Description: TODO
 * @Version: 1.0
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] ints = m1();
        for (int i :
                ints) {
            System.out.println(i);
        }

        System.out.println("chenggong");

        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println(map.size());
        map.put(1,1);
        System.out.println(map.size());

    }
    public static int[] m1() {
        return new int[2];
    }
}
