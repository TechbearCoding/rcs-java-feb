import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet skaitli!");
        int f = sc.nextInt();

        int result = 1;
        for(int i = 1; i <= f; i++){
            result = result * i;
        }

        System.out.println(result);
    }

    public static void homework2(){
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for(int i = 0; i < 5; i++){
            System.out.println("Ievadiet skaitli!");
            int a = sc.nextInt();
            sum = sum + a;
        }
        System.out.println("Rezultāts ir " + sum);
    }
    public static void homework1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet skaitli!");
        int a = sc.nextInt();

        if(a < 1){
            System.out.println("Kļūda!");
        }else{
            for(int i = 0; i < a; i++){
                System.out.println("Hello world!");
            }
        }
    }
}