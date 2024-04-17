import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        task3();
    }

    public static void task3(){
        int[] numbers = {1, 4, 7, 2, 9, 4, 6};
        List<Integer> numberLst = new ArrayList<>();

//        for(int i = 0; i < numbers.length; i++){
//            numberLst.add(numbers[i]);
//        }

        for(int i = numbers.length-1; i > -1; i--){
            numberLst.add(numbers[i]);
        }

        for(int i = 0; i < numberLst.size(); i++){
            System.out.print(numberLst.get(i) + " ");
        }
    }

    public static void sample1(){
        List<String> strList = new ArrayList<>();
        System.out.println(strList.size());

        strList.add("aaaa");
        strList.add("bbbb");
        System.out.println(strList.size());

        //System.out.println(strList.get(0));

        for(int i = 0; i < strList.size(); i++){
            System.out.println(strList.get(0));
        }

        List<Integer> b = new ArrayList<>();

    }

    public static void task2(int[] a, int num){
        boolean found = false;
        for(int i = 0; i < a.length; i++){
            if(a[i] == num){
                System.out.println(i);
                found = true;
            }
        }
        if(found == false){
            System.out.println("Skaitlis nav atrasts");
        }
    }

    public static void task1(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }

}