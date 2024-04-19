package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task2c();
    }

    public static void task2c(){
        List<Double> skaitli = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Ievadiet skaitli!");
            skaitli.add(sc.nextDouble());
            sc.nextLine();

            System.out.println("Exit, lai beigtu ievadi!");
            String choice = sc.nextLine();

            if(choice.equals("exit")){
                break;
            }
        }

        double videja = getAvg(skaitli);
        System.out.println(videja);
    }

    public static void task2b(){
        List<Double> skaitli = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        String choice = "";

        while(!choice.equals("exit")){
            System.out.println("Ievadiet skaitli!");
            skaitli.add(sc.nextDouble());
            sc.nextLine();

            System.out.println("Exit, lai beigtu ievadi!");
            choice = sc.nextLine();
        }

        double videja = getAvg(skaitli);
        System.out.println(videja);
    }

    public static void task2(){
        List<Double> skaitli = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 6; i++){
            System.out.println("Ievadiet skaitli!");
            skaitli.add(sc.nextDouble());
        }

        double videja = getAvg(skaitli);
        System.out.println(videja);
    }

    public static double getAvg(List<Double> sk){
        //dabut videjo vertibu
        double sum = 0;
        for(int i = 0; i < sk.size(); i++){
            sum += sk.get(i);
        }
        return sum / sk.size();
    }
    public static void task1(){
        Scanner sc = new Scanner(System.in);
        List<String> students = new ArrayList<>();

        System.out.println("Ievadiet, cik studentus gribat pievienot sarakstam!");
        int skaits = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < skaits; i++){
            System.out.println("Ievadiet studentu!");
            String name = sc.nextLine();
            students.add(name);
        }
        readList(students);
    }

    public static void readList(List<String> studentList){
        for(int i = 0; i < studentList.size(); i++){
            System.out.println(studentList.get(i));
        }
    }

}