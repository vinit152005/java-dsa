package BinarySearch;

public class FirstAndLastPosition {
        public int[] searchRange(int[] nums, int target) {

            int[] ans = {-1 , -1};

            int start = search(nums , target , true);
            int last = search(nums , target , false);

            ans[0] = start;
            ans[1] = last;
            return ans;
        }
        int search(int[] nums , int target , boolean findStartIndex){
            int ans = -1;
            int first = 0;
            int last = nums.length - 1;
            while(first <= last){
                int mid = first + (last - first)/2;
                if(target < nums[mid]){
                    last = mid - 1;
                }else if(target > nums[mid]){
                    first = mid + 1;
                }else{
                    ans = mid;
                    if(findStartIndex){
                        last = mid - 1;
                    }else{
                        first = mid + 1;
                    }
                }
            }
            return ans;
        }
}
