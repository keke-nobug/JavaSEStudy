package com.powernode.test.iostream;

import java.io.File;

/**
 * ClassName: Mkdir
 * Package: com.powernode.test.iostream
 * Description:
 * Author: qzk
 * Create 2023/9/11 16:46
 * Version: 1.0
 */
public class Mkdir {
    public static void main(String[] args) {
        File file = new File("src/com/powernode/test/iostream/3");
        if(!file.exists()){
            file.mkdirs();
        }
        System.out.println(111);
    }

}
