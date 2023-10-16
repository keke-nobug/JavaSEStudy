package test;

import java.util.Objects;

/**
 * ClassName: EqualsDemo
 * Package: test
 * Description:
 * Author: qzk
 * Create 2023/9/5 11:10
 * Version: 1.0
 */
public class EqualsDemo {
    private int a;
    private String s;

    @Override
    public String toString() {
        return "EqualsDemo{" +
                "a=" + a +
                ", s='" + s + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualsDemo that = (EqualsDemo) o;
        return a == that.a && Objects.equals(s, that.s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, s);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public EqualsDemo(int a, String s) {
        this.a = a;
        this.s = s;
    }

    public EqualsDemo() {
    }

    public static void main(String[] args) {

    }
}
