package LeetCode;

import java.util.LinkedHashMap;

/**
 * @BelongsProject: JavaSEStudy
 * @BelongsPackage: LeetCode
 * @Author: qzk
 * @CreateTime: 2024/9/19 11:49
 * @Description: TODO
 * @Version: 1.0
 */
public class Lc146_LRUCache {
    int capacity;
    LinkedHashMap<Integer, Integer> cache = new LinkedHashMap<>();

    public Lc146_LRUCache(int cap) {
        this.capacity = cap;
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }
        makeRecently(key);
        return cache.get(key);
    }

    public void put(int key, int val) {
        if (cache.containsKey(key)) {
            cache.put(key, val);
            makeRecently(key);
            return;
        }
        if (cache.size() >= this.capacity) {
            int oldstKey = cache.keySet().iterator().next();
            cache.remove((oldstKey));
        }
        cache.put(key, val);
    }

    private void makeRecently(int key) {
        int val = cache.get(key);
        cache.remove(key);
        cache.put(key, val);
    }
}
