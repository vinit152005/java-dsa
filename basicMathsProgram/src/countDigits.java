import java.util.Scanner;
public class countDigits {
    static int count(int num){
        int count = 0;
        while(num > 0){
            count +=1;
            num /=10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num == 0){
            System.out.println(1);
            return;
        }
        System.out.println(count(num));
    }
}
