package BinarySearch;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int peak = peakElementInArray(nums);
        if(peak == -1){
            return binarySearch( nums , target , 0 , nums.length -1);
        }
        if(target == nums[peak]){
            return peak;
        }

        int ans = binarySearch( nums , target ,0 , peak - 1) ;
        if(ans != -1){
            return ans;
        }
        ans = binarySearch( nums , target , peak + 1 , nums.length -1);
        return ans;
    }

    public int binarySearch(int[] nums , int target , int first , int end) {
        while(first <= end ){
            int mid = first + (end - first)/2;
            if(target < nums[mid]){

                end  = mid  -1;
            }else if(target > nums[mid]){

                first = mid +1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public int peakElementInArray(int[] nums){
        int start  = 0;
        int end = nums.length-1;
        int mid = 0;

        while(start < end){
            mid = start + (end - start)/2;
            if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid-1]){
                return mid -1;
            }
            if(nums[start] <= nums[mid]){
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
}
