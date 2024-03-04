import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        homework1();
    }

    public static void homework1(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet simbolu virkni!");
        String input = sc.nextLine();

        int count = input.length();

        if(count > 5){
            System.out.println("Programmēt ir forši!");
        }
    }
}