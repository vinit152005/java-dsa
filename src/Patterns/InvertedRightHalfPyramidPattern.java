package Patterns;

import java.util.Scanner;

public class InvertedRightHalfPyramidPattern {
    static void pattern(int num){
        for(int i = 0; i < num; i++){
            for(int j = 0; j < num - i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        pattern(num);
    }
}
