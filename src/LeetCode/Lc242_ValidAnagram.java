package LeetCode;

import java.sql.SQLOutput;
import java.util.HashMap;

/**
 * @BelongsProject: JavaSEStudy
 * @BelongsPackage: LeetCode.HashTable
 * @Author: qzk
 * @CreateTime: 2024/6/24 10:15
 * @Description: TODO
 * @Version: 1.0
 */
public class Lc242_ValidAnagram {
    public static void main(String[] args) {

        String s = "rat";
        String t = "car";


        HashMap<Character,Integer> window = new HashMap<>();
        HashMap<Character,Integer> need = new HashMap<>();

        for (char c : s.toCharArray()) {
            window.put(c, window.getOrDefault(c,0) + 1);
        }
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c,0) + 1);
        }

        for (char c : s.toCharArray()) {
            System.out.println(c + ":" + window.get(c) + "    " + need.get(c));
            }
    }
}
