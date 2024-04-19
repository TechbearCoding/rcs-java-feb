package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task2();
    }

    public static void task2(){
        List<Double> skaitli = new ArrayList<>();

        //ievade

        double videja = getAvg(skaitli);
        System.out.println(videja);
    }

    public static double getAvg(List<Double> sk){
        //dabut videjo vertibu
        double avg = 0;

        return avg;
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