package BinarySearch;

public class SearchInRotatedSortedArrayII {
    public boolean search(int[] nums, int target) {
        int pivot = pivot(nums);
        if(pivot == -1){
            return BinarySearch(nums,0 , nums.length -1 , target);
        }
        if(nums[pivot] == target){
            return true;
        }
        if(nums[0] <= target){
            return BinarySearch(nums,0 , pivot -1, target);
        }
        return BinarySearch(nums,pivot+1 , nums.length -1, target);

    }
    public boolean BinarySearch(int[] nums , int start , int end , int target){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < nums[mid]){
                end = mid -1;
            }else if(target > nums[mid]){
                start = mid+1;
            }else{
                return true;
            }
        }
        return false;
    }
    public int pivot(int[] nums){
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid-1]){
                return mid-1;
            }
            if(nums[start] == nums[mid] && nums[end] == nums[mid]){
                if(start < end && nums[start] > nums[start + 1]){

                    return start;

                }

                start++;

                if(end > start && nums[end - 1] > nums[end]){

                    return end - 1;

                }

                end--;
            }else if(nums[start] < nums[mid] || nums[start] == nums[mid] && nums[start] > nums[end]){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
}
