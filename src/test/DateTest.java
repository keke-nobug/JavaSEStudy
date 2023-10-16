package test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: Test
 * Package: test
 * Description:
 * Author: qzk
 * Create 2023/9/7 13:39
 * Version: 1.0
 */
public class DateTest {
    public static void main(String[] args) {
        System.out.println(new Date()); // 国外时间制式：Thu Sep 07 14:24:19 CST 2023
        SimpleDateFormat sdf = new SimpleDateFormat(); // 创建时间格式转换对象 默认格式
        String curTime = sdf.format(new Date());
        System.out.println(curTime); // 默认格式输出 23-9-7 下午2:24

        long currentTimeMillis = System.currentTimeMillis(); // 获取毫秒值，从1970年1月1日00:00:00 000开始计算的。但是在中国的截止起始时间是1970年1月1日08:00:00 000
        System.out.println(currentTimeMillis); // 1694067859947
        System.out.println(new Date(currentTimeMillis)); // 将毫秒值转为时间 Thu Sep 07 14:24:19 CST 2023
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss sss");
        System.out.println(sdf1.format(new Date(currentTimeMillis))); // 转为自定格式输出 2023-09-07 14:24:19 019

    }
}
