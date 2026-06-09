package BasicMathProblems;

import java.util.Scanner;

public class primeNumber {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean isPrime = true;
        if(num <= 1){
            System.out.println(false);
            return;
        }
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                System.out.println(false);
                return;
            }
        }
        System.out.println(isPrime);
    }
}
