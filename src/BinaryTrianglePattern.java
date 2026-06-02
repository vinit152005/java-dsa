import java.util.Scanner;

public class BinaryTrianglePattern {
    static void pattern(int num){
        for(int i = 0; i < num; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(i % 2 == 0 ? (j % 2 == 0 ? 1 : 0) : (j % 2 == 0 ? 0 : 1));
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
