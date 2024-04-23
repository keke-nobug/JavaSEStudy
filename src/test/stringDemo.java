package test;

import java.util.Arrays;

/**
 * @BelongsProject: JavaSEStudy
 * @BelongsPackage: test
 * @Author: qzk
 * @CreateTime: 2024/3/9 23:56
 * @Description: TODO
 * @Version: 1.0
 */
public class stringDemo {
    public static void main(String[] args) {
        String s1 = new String();

        int i;int j;
        char[] c = {'a', 'b', 'c'};
        Arrays.sort(c);
//      数组转字符串
        String s = new String(c, 0, 3);
        System.out.println(s);
        for (char a :
                s.toCharArray()) {

        }

        System.out.println(s.substring(0, 2)); // 左闭右开

//      字符串长度方法
        int lString = s.length();

//      字符串转数组
        char[] chars = s.toCharArray();

//      数组长度方法
        int lArray = chars.length;

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(c);
        System.out.println(stringBuffer);
        stringBuffer.delete(0, 1); // 左闭右开
        System.out.println(stringBuffer);
        stringBuffer.deleteCharAt(0);
        System.out.println(stringBuffer);

        find();
    }

    public static int[] find() {
        return new int[]{1,2};
    }
}
