import java.util.*;
public class armstrongNumber {
    static int count(int num){
        if (num == 0) return 1;
        int count = 0;
        while(num > 0){
            count +=1;
            num /=10;
        }
        return count;
    }
    static int armstrongNumber(int num , int count){
        int armstrongNum = 0;
        while(num > 0){
            int digit = num % 10;
            armstrongNum +=(int)Math.pow(digit , count);
            num /=10;
        }
        return armstrongNum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(armstrongNumber(num , count(num)) == num);
    }
}
