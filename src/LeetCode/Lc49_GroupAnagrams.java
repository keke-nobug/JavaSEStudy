package LeetCode;

import java.util.*;

/**
 * @BelongsProject: JavaSEStudy
 * @BelongsPackage: LeetCode.HashTable
 * @Author: qzk
 * @CreateTime: 2024/6/24 12:01
 * @Description: TODO
 * @Version: 1.0
 */
public class Lc49_GroupAnagrams {
    public static void main(String[] args) {

    }
    public List<List<String>> groupAnagrams(String[] strs) {
        /*
        如果把 aab,aba,baa按照字母从小到大排序，我们可以得到同一个字符串 aab
        而对于每种字母出现次数不同于 aab 的字符串，例如 abb 和 bab，排序后为 abb，
        不等于 aab\texttt{aab}aab。
        所以当且仅当两个字符串排序后一样，这两个字符串才能分到同一组。
        */

        // 把排完序的str作为key 异位词做value
        Map<String, List<String>> map = new HashMap<>();

        // 对strs遍历，对其中每个str操作
        for (String str : strs) {

            // 对字符数组的每个字符排序：先转数组用Arrays工具类sort方法，排完序的字符数组s
            char[] s = str.toCharArray();
            Arrays.sort(s);

            // 把排完序的字符数组s转为string 判断是否存在哈希表里，如果在 则将该str加入到value
            if (map.containsKey(new String(s))) {
                // get() 返回指定键所映射的值value，没有该key对应的值则返回 null
                map.get(new String(s)).add(str);
            }
            //  如果不存在，则添加到哈希表里
            else {
                List<String> temp = new ArrayList<>();
                temp.add(str);
                map.put(new String(s), temp);
            }
        }
        return new ArrayList<>(map.values());
    }
}
