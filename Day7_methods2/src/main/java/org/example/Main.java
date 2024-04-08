package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //System.out.println(homework("abababaAAAaxcccc"));

        boolean c = homework2("abababaAAAaxcccc");
        System.out.println(c);
        if(c){

        }

        if(c == true){ //if(c)

        }

        if(c != true){

        }

        if(!c){

        }

        sample3("abababaAAAaxcccc");

        int b = sample4();
        System.out.println(b);

    }

    public static boolean homework2(String a){
        if(a.toLowerCase().contains("aaa")){
            return true;
        }else{
            return false;
        }
    }

    public static int homework(String a){
        if(a.toLowerCase().contains("aaa")){
            return 1;
        }else{
            return 0;
        }
    }

    public static int sample4(){
        String a = "abababaAAAaxcccc";
        if(a.toLowerCase().contains("aaa")){
            return 1;
        }else{
            return 0;
        }
    }

    public static void sample3(String a){
        if(a.toLowerCase().contains("aaa")){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }

    public static int task2(){
        Scanner sc = new Scanner(System.in);
        int result = 0;

        while(result < 1){
            System.out.println("Ievadiet skaitli!");
            result = sc.nextInt();
        }

        return result;
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