package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            System.out.println("Ievadiet skaitli!");
            numbers.add(sc.nextInt());
        }
        System.out.println(Games.guess(numbers));

    }

    public static void sample1(){
        int result = Samples.sum(3, 4);
        System.out.println(result);

        List<Integer> a = Samples.getList();
    }
}