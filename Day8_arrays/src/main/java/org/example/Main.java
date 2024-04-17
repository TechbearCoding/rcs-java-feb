package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        homework2();
    }

    public static void homework2(){
        int[] numbers = new int[10];
        int max = Integer.MIN_VALUE;
        Random r = new Random();

        for(int i = 0; i < numbers.length; i++){
            //numbers[i] = r.nextInt((99-1+1)+1);
            numbers[i] = r.nextInt(100);
            if (max < numbers[i]) {
                max = numbers[i];
            }
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nLielākais skaitlis ir " + max);
    }

    public static void homework1(){
        Scanner sc = new Scanner(System.in);
        int len = 0;

        while(len < 2){
            System.out.println("Ievadiet masīva garumu!");
            len = sc.nextInt();
        }

        int[] numbers = new int[len];
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < len; i++){
            System.out.println("Ievadiet skaitli!");
            numbers[i] = sc.nextInt();

            sum += numbers[i];
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }

        System.out.println("Max-" + max);
        System.out.println("Summa- " + sum);
    }

    public static void task2(){
        Scanner sc = new Scanner(System.in);
        double[] m = new double[10];

        for(int i = 0; i < m.length; i++){
            System.out.println("Ievadiet skaitli!");
            m[i] = sc.nextDouble();
        }
        //System.out.println(Arrays.stream(m).average().getAsDouble());
        double sum = 0;
        for(int i = 0; i < m.length; i++){
            sum = sum + m[i];
        }

        System.out.println(sum / m.length);
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