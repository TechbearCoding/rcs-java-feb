package org.example;

import java.util.ArrayList;
import java.util.List;

public class Samples {
    public static int a = 3;
    private static int b = 4;

    public static void sample1(){
        System.out.println("Hello world!");
        sample2();
    }

    private static void sample2(){
        System.out.println("Private world!");
    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static List<Integer> getList(){
        List<Integer> a = new ArrayList<>();

        //...

        return a;
    }
}
