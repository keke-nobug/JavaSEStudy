package test;

import java.util.Scanner;

/**
 * @BelongsProject: JavaSEStudy
 * @BelongsPackage: test
 * @Author: qzk
 * @CreateTime: 2024/12/2 16:01
 * @Description: TODO
 * @Version: 1.0
 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();     // 空格也算一个nextLine
        String s = scanner.nextLine();

        System.out.println(n);
        System.out.println(s);
    }
}
