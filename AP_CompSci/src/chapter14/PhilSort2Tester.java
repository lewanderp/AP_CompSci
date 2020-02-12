package chapter14;

import java.util.Random;

public class PhilSort2Tester {
    public static Random r = new Random();
    public static int[] a = new int[50];

    public static void main(String[] args) {
        InitA();
        System.out.println(printA());
        a = new Philsort2(a).getASorted();
        System.out.println(printA());
    }

    public static void InitA() {
        for (int i = 0; i < a.length - 1; i++) {
            a[i] = r.nextInt(50) + 1;
        }
    }

    public static String printA() {
        String s = "";
        s += "[ ";
        for (int i = 0; i < a.length - 2; i++) {
            s += a[i] + ", ";
        }
        s += a[a.length - 1] + " ]";
        return s;
    }
}