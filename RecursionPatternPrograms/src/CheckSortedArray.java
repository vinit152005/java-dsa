import java.util.*;

public class CheckSortedArray {

    public static boolean isSorted(int[] arr ,int idx){
        if (idx == arr.length - 1){
            return true;
        }
        if(arr[idx+1] > arr[idx]){
            return isSorted(arr , idx + 1);
        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idx = 0;
        int lengthOfArray = input.nextInt();
        int[] arr = new int[lengthOfArray];
        for(int i = 0; i < lengthOfArray; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(isSorted(arr , idx));
    }

}
