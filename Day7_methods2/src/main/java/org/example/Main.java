package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int result = sample2();

        System.out.println(result);
    }

    public static int sample2(){
        //ja cilveka ievaditais skaitlis ir lielaks par pieci  atgriezt skaitli, ja nē, atgriezt 0
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet skaitli!");
        int a = sc.nextInt();

        if(a > 5){
            return a;
        }
        return 0;
    }

    public static int sample1(){
        //Likt lietotājam ievadīt divus skaitļus un ar return atgriezt summu
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet skaitli!");
        int a = sc.nextInt();

        System.out.println("Ievadiet skaitli!");
        int b = sc.nextInt();
        return a + b;
    }

    public static void task1(int times) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        if(times % 2 == 0){
            for(int i = 0; i < times; i++) {
                System.out.println("Ievadiet skaitli!");
                int number = sc.nextInt();
                sum = sum + number;
            }
        } else{
            while(sum < 15){
                System.out.println("Ievadiet skaitli!");
                int number = sc.nextInt();
                sum = sum + number;
            }
        }
        System.out.println(sum);
    }
}