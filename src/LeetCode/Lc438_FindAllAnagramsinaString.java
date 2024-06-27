package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @BelongsProject: JavaSEStudy
 * @BelongsPackage: LeetCode
 * @Author: qzk
 * @CreateTime: 2024/6/27 22:45
 * @Description: TODO
 * @Version: 1.0
 */
public class Lc438_FindAllAnagramsinaString {
    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";
        List<Integer> list;
        list = findAnagrams(s, p);
        for (int x :
                list) {
            System.out.println(x);
        }

    }
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        for (char c :
                p.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int l = 0, r = 0;
        int valid = 0;
        while (r < s.length()) {
            char c = s.charAt(r);
            r++;    // 开窗

            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(need.get(c))) valid++;
            }

            // 注意 while if 这里两种情况
            while (valid == need.size()) {
                if (r - l == p.length()){
                    list.add(l);
                }
                char d = s.charAt(l);
                if (need.containsKey(d)) {
                    if (need.get(d).equals(window.get(d))) {
                        valid--;
                    }
                    window.put(d,window.get(d) - 1);
                }
                l++;
            }
        }
        return list;
    }
}
