package org.example;

import java.util.List;
import java.util.Random;

public class Games {
    public static boolean guess(List<Integer> numbers) {
        Random r = new Random();
        int toGuess = r.nextInt(16);

        for(int i = 0 ; i < 3; i++){
            if(numbers.get(i) == toGuess){
                System.out.println("Uzmineji- " + numbers.get(i));
                return true;
            }
        }

        return false;
    }
}
