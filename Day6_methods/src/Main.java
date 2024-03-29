import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1("aa", "bb", "cc");
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

