package BinarySearch;

public class FindRotationCountRotatedSortedArray {
    public int findKRotation(int arr[]) {
        int start = 0;
        int end = arr.length-1;
        if (arr[start] <= arr[end]) {
            return 0;
        }
        while(start < end){
            int mid = start + (end - start)/2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid+1;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid;
            }
            if(arr[start] <= arr[mid]){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return 0;
    }
}
