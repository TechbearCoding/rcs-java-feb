import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sample3();
    }

    public static void sample3(){
        //Uztaisīt programmu, kas ar for ciklu saskaita skaitļus no 1-5
        int result = 0;
        for(int i = 1; i < 6; i++){
            result = result + i;
        }
        System.out.println(result);
    }

    public static void sample2(){
        //for
        // i++ ->  i = i+1
        // i+=2 -> i = i+2
        for(int i = 0; i < 11; i++){
            System.out.println(i);
        }
    }

    private static void task2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sveiki, lūdzu, Ievadiet skaitli:");

        int input = sc.nextInt();

        if((input >= 10) || (input <= 5)){
            System.out.println("$$");
        }else {
            System.out.println("$");
        }
    }

    public static void task1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi vārdu!");

        String input = sc.nextLine();
        String result = "programmesana";

        if(input.equals(result)){
            System.out.println("Uzvarēji!");
        }else if(input.length() == result.length()){
            System.out.println("Vienāds simbolu skaits");
        }else{
            System.out.println("Zaudēji!");
        }

        if(input.equals(result) || input.length() == result.length()){
            // && and
            // || or
            System.out.println("Uzvarēji!");
        } else{
            System.out.println("Zaudēji!");
        }
    }

    public static void sample1(){

        int a = 4;

        // >
        // <
        // >=
        // <=
        // ==
        // !=

        String b = "aaa";

        if(b.equals("aaa")){

        }else{
            System.out.println();
        }
    }
}