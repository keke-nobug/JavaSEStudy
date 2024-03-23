package test;

/**
 * @BelongsProject: JavaSEStudy
 * @BelongsPackage: test
 * @Author: qzk
 * @CreateTime: 2024/3/17 11:39
 * @Description: TODO
 * @Version: 1.0
 */
public class LC100248 {
    public static void main(String[] args) {

    }

    public boolean isSubstringPresent(String s) {

        for (int i = 0; i < s.length(); i++) {
            String s1 = palindrome(s, i, i);
            String s2 = palindrome(s, i, i + 1);
            if (s1.length() >= 2 || s2.length() >= 2) return true;
        }
        return false;
    }

    private String palindrome(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }
}
