package ArrayQuestion;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for(int i = 0; i < nums.length; i++){
            int digit = nums[i];
            for(int j = 0; j < nums.length; j++){
                if(i == j){
                    continue;
                }
                if(nums[i] + nums[j] == target){
                    ans[1] = i;
                    ans[0] = j;
                }
            }
        }
        return ans;
    }
}
