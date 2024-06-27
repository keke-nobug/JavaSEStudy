package LeetCode;

import java.util.HashMap;

/**
 * @BelongsProject: JavaSEStudy
 * @BelongsPackage: LeetCode
 * @Author: qzk
 * @CreateTime: 2024/6/27 19:53
 * @Description: TODO
 * @Version: 1.0
 */
public class Lc3_LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int ans = lengthOfLongestSubstring(s);
        System.out.println(ans);


    }
    public static int lengthOfLongestSubstring(String s) {
        char[] array = s.toCharArray();
        int n = array.length;
        HashMap<Character, Integer> window = new HashMap<>();

        int l = 0;
        int r = 0;
        int ans = 0;
        while (r < n) {
            char c = array[r];
            if (!window.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                r++;
            }
            else {
                char d = array[l];
                window.remove(d);
                l++;
            }
            ans = Math.max(ans, r - l);

        }

        return ans;

    }
}
