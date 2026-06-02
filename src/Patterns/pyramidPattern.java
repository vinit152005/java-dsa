package Patterns;

import java.util.Scanner;

public class pyramidPattern {
    static void pattern(int num){
        int i = 0;
        while(i < num){
            int j = 1;
            while (j < num - i){
                System.out.print("  ");
                j++;
            }
            int k = 0;
            while(k <= i){
                System.out.print("* ");
                k++;
            }
            int z = 0;
            while(z<i){
                System.out.print("* ");
                z++;
            }
            System.out.println();
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        pattern(num);
    }
}
