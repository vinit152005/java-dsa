package BasicMathProblems;

import java.util.*;

public class palindromeNumber {
    static int reverse(int num){
        int reverse = 0;
        while(num > 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.println(reverse(num) == num);
    }
}