package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sample1();
    }

    public static void sample1(){
        int garums = 6;
        int[] m = new int[garums];
        Scanner sc = new Scanner(System.in);
//        System.out.println("Ievadiet skaitli!");
//        m[0] = sc.nextInt();
//
//        System.out.println("Ievadiet skaitli!");
//        m[1] = sc.nextInt();

        //...
        //0 1 2 3 4 5
        for(int i = 0; i < m.length; i++){
            System.out.println("Ievadiet skaitli!");
            m[i] = sc.nextInt();
        }

        for(int i = 0; i < m.length; i++){
            System.out.print(m[i] + " ");
        }
        System.out.println();
    }

    public static boolean task1(){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.println("Ievadiet skaitli!");
            int number = sc.nextInt();
            if(number == 28){
                return true;
            }
        }

        return false;
    }
}