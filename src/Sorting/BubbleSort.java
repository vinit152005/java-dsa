package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,6,9,34,32,4};
        for(int j = 0; j < arr.length; j++){
            for(int i =1; i<arr.length-j; i++){
                if(i<arr.length-1 && arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        for(int i  =0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
