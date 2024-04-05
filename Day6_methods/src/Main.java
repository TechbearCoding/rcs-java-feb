import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        task2b(3);

    }

    public static void task2b(int times){
        if(times > 0){
            Scanner sc = new Scanner(System.in);
            int sum = 0;

            for(int i = 0; i < times; i++){
                System.out.println("Ievadiet skaitli!");
                int number = sc.nextInt();

                if(number % 2 == 0){
                    sum = sum + number;
                }
            }
            System.out.println(sum);
        }else{
            System.out.println("Parametra vērtībai jābūt lielākai par 0");
        }
    }

    public static void task2(int times){
        if(times > 0){
            Scanner sc = new Scanner(System.in);
            int sum = 0;

            for(int i = 0; i < times; i++){
                System.out.println("Ievadiet skaitli!");
                int number = sc.nextInt();
                sum = sum + number;
            }
            System.out.println(sum);
        }else{
            System.out.println("Parametra vērtībai jābūt lielākai par 0");
        }
    }

    public static void task1(String a, String b, String c){
        String result = a + b + c;
        System.out.println(result);
    }

    public static void samples(){
        sample2(1, 2);
        sample2(99, 4);

        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        sample2(6, c);

        sample3("aaaaaaaaaa");
    }

    public static void sample3(String a){
        System.out.println(a);
    }

    public static void sample2(int a, int b){
        System.out.println(a + b);
    }

    public static void sample1(){
        System.out.println("aaaaaa");
    }
}

