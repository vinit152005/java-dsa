package ArrayQuestion;

import java.util.Scanner;

public class binarySearch {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] array = {1 , 10 ,19 , 90};
            int target = input.nextInt();
            int ans  = binarySearch(array , target);
            System.out.println(ans);

        }
        public static int binarySearch(int[] array , int target){
            int start = 0;
            int end = array.length - 1;

            while(start <= end){
                int mid = start + (end - start)/2;
                if(target < array[mid]){
                    end = mid - 1;
                }else if(target > array[mid]){
                    start = mid + 1;
                }else{
                    return mid;
                }
            }
            return -1;
        }

}
