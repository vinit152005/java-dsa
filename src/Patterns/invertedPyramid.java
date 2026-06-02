package Patterns;
import java.util.Scanner;
public class invertedPyramid {
    static void pattern(int num){
      for(int i = 0; i < num; i++){
          for(int j = 0; j < i; j++){
              System.out.print("  ");
          }
          for(int j = 0; j < (num - i)*2 - 1; j++){
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
