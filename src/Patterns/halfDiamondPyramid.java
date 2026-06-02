package Patterns;
import java.util.Scanner;
public class halfDiamondPyramid {
    static void pattern(int num){
        for(int i = 0; i < num; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < num - 1; i++){
            for(int j = 1; j < num - i; j++){
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
