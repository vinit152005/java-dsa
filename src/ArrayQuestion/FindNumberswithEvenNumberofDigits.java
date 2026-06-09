package ArrayQuestion;
import java.util.Scanner;
public class FindNumberswithEvenNumberofDigits {

    public int findNumbers(int[] nums) {
        int answer = 0;
        for(int i : nums){
            int count = 0;
            while(i > 0){
                i /= 10;
                count++;
            }
            if(count % 2 == 0){
                answer++;
            }
        }
        return answer;
    }
}
