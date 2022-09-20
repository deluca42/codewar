package primenumber;

import java.util.ArrayList;
import java.util.List;

public class primeNumberCount {
    public static void main(String[] args) {
        // prime number is a whole number greater than 1
        // prime number is divided para 1 and itself 
        
        List<Integer> primeNumber = new ArrayList<>();

        for (int numberToCheck=2; numberToCheck <= 100 ; numberToCheck++) {
            Boolean isPrime = true;
            for (int factor=2;factor <= numberToCheck/2 ; factor++){
                if(numberToCheck % factor ==0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime==true){
                primeNumber.add(numberToCheck);
            }
        }

        for (int number : primeNumber)
        System.out.println(number);

    }
}
