package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        System.out.println(3+2);
//        System.out.println(5);
//        System.out.println("3 + 2");
//        System.out.println("3" + 2);
//        System.out.println("aaaaa" + "bbbbbb");
//
//        System.out.println("-----------");
//
//        int a = 6;
//        System.out.println(a);
//        a = 99;
//        System.out.println(a + "2");
//
//        String c = "Mani sauc Mārtiņu";
//        System.out.println(c);

        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet vārdu!");
        String name = sc.nextLine();

        System.out.println("Sveiki, " + name + "!");
    }
}