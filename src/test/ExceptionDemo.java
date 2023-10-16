package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * ClassName: ExceptionDemo
 * Package: test
 * Description:
 * Author: qzk
 * Create 2023/9/7 15:35
 * Version: 1.0
 */
public class ExceptionDemo {
    public static void main(String[] args) {

        try {
            new FileInputStream("sa//fsf");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
//            e.printStackTrace();
        }


    }

}
