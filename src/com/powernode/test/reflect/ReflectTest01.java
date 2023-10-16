package com.powernode.test.reflect;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * ClassName: ReflectTest01
 * Package: com.powernode.test.reflect
 * Description:
 * Author: qzk
 * Create 2023/9/13 13:46
 * Version: 1.0
 */
public class ReflectTest01 {
    @Deprecated
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
        Class<User> userClass = User.class;
        Class<?> aClass = Class.forName("com.powernode.test.reflect.User");
        Object o = aClass.newInstance();
        System.out.println(o);


/*        String path = Thread.currentThread().getContextClassLoader().getResource("com/powernode/test/reflect/test.properties").getPath();
        System.out.println(path);
        Properties properties = new Properties();
        properties.load(new FileInputStream(path));
        String className = properties.getProperty("className");
        System.out.println(className);*/


        URL url = Thread.currentThread().getContextClassLoader().getResource("com/powernode/test/reflect/test.properties");
        System.out.println(url);
        System.out.println(url.getPath());
/*        InputStream resourceAsStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("com/powernode/test/reflect/test.properties");
        Properties properties = new Properties();
        properties.load(resourceAsStream);
        resourceAsStream.close();
        String className = properties.getProperty("className");
        System.out.println(className);*/


        ResourceBundle bundle = ResourceBundle.getBundle("com/powernode/test/reflect/test");
        String string = bundle.getString("className");
        System.out.println(string);
    }
}

class User{
    public User() {
    }
    static {
        System.out.println("静态代码块执行");
    }

}