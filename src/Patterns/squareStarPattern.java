package Patterns;
import java.util.*;
public class squareStarPattern {
    static void patter(int num){
        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        patter(num);
    }
}
