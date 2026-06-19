package BinarySearch;

public class peakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int first = 0;
        int end = arr.length-1;
        while(first <= end){
            int mid = first + (end - first)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid -1;
            }else{
                first = mid + 1;
            }
        }
        return first;
    }
}
