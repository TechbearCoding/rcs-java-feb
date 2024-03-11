import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
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