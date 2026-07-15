package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 6, 9, 34, 32, 4};

        for (int j = 0; j < arr.length - 1; j++) {
            boolean swap = false;

            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swap = true;
                }
            }

            if (!swap) {
                break;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}