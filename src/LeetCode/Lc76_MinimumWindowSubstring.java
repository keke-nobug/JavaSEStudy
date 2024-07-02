package LeetCode;

import java.util.HashMap;

/**
 * @BelongsProject: JavaSEStudy
 * @BelongsPackage: LeetCode
 * @Author: qzk
 * @CreateTime: 2024/6/28 22:28
 * @Description: TODO
 * @Version: 1.0
 */
public class Lc76_MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "cabwefgewcwaefgcf", t = "cae";
        System.out.println(minWindow(s, t));
    }

    public static String minWindow(String s, String t) {
        HashMap<Character, Integer> window = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();

        for (char c :
                t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int l = 0, r = 0;
        int valid = 0;
        int length = Integer.MAX_VALUE;
        int start = 0;
        while (r < s.length()) {
            char c = s.charAt(r);
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(need.get(c))) {
                    valid++;
                }
            }
            r++;

            while (valid == need.size()) {
                if (r - l < length) {
                    start = l;
                    length = r - l;
                }

                char d = s.charAt(l);
                if (need.containsKey(d)) {
                    if (window.get(d).equals(need.get(d))) {
                        valid--;
                    }
                    window.put(d, window.get(d) - 1);
                }
                l++;
            }
        }
        return s.substring(start, start + length);
    }
}
