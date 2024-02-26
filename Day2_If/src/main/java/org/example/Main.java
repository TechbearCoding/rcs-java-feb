package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task2();
    }

    public static void sample2(){
        //Lietotājs ievada skaitli.
        //Ja skaitlis ir lielāks par 5- izvadīt "###"
        //ja nav- izvadīt "#"
        //Ja lietotājs ievada 5 izvadīt "!!"
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet skaitli");
        int number = sc.nextInt();

        if(number > 5){
            System.out.println("###");
        }else if(number == 5){
            System.out.println("!!");
        }else{
            System.out.println("#");
        }

    }

    public static void task2(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet 1. skaitli");
        int number1 = sc.nextInt();

        System.out.println("Ievadiet 2. skaitli");
        int number2 = sc.nextInt();

        int sum = number1 + number2;
        System.out.println(sum);
        System.out.println(number1 - number2);

        if(sum == 0){
            System.out.println("0");
        }else if(sum > 0){
            System.out.println("+");
        }else if(sum < 0){
            System.out.println("-");
        }
    }

    public static void task1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet vārdu");
        String name = sc.nextLine();

        System.out.println("Ievadiet gadu kurā piedzimi!");
        int year = sc.nextInt();
        int age = 2024 - year;

        System.out.println("Lietotāju sauc " + name + ". Lietotājam ir " + (2024-year) + " gadi.");
        System.out.println("Lietotāju sauc " + name + ". Lietotājam ir " + age + " gadi.");
    }
    public static void sample1(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet skaitli");
        int input = sc.nextInt();
        int d = 2024 - 1993;

        System.out.println(input + 2);
        double a = 3.4;
    }
}