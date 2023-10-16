package com.powernode.test.iostream;

import java.io.*;

/**
 * ClassName: FileInputOutputStream
 * Package: com.powernode.test.iostream
 * Description:
 * Author: qzk
 * Create 2023/9/10 21:59
 * Version: 1.0
 */
public class FileInputOutputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = null;
        try {
//            inputStream = new FileInputStream("demo");
            inputStream = new FileInputStream("src/com/powernode/test/iostream/demo1");
            try {
                int read = 0;
                while ((read = inputStream.read()) != -1){
                    System.out.println(read);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            
        }


        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("file"));
    }



}
