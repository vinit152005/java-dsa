/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */




package BinarySearch;
//This is a hard level question on LeetCode
//Problem Number 1095
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakElementInArray(mountainArr);
        if(target == mountainArr.get(peak)){
            return peak;
        }

        int ans = binarySearch( mountainArr , target ,0 , peak - 1 ,true);
        if(ans != -1){
            return ans;
        }else{
            ans = binarySearch( mountainArr , target , peak + 1 , mountainArr.length() -1 , false);
            return ans;}
    }
    public int binarySearch(MountainArray mountainArr , int target , int first , int end ,boolean asc){
        while(first <= end ){
            int mid = first + (end - first)/2;
            if(target < mountainArr.get(mid)){
                if(asc){
                    end = mid -1;
                }else{
                    first = mid+1;
                }
            }else if(target > mountainArr.get(mid)){
                if(asc){
                    first = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else{
                return mid;
            }
        }
        return -1;
    }
    public int peakElementInArray(MountainArray mountainArr){
        int first = 0;
        int end = mountainArr.length() -1;
        while(first < end){
            int mid = first + (end - first)/2;
            if(mountainArr.get(mid) > mountainArr.get(mid + 1)){
                end = mid;
            }else{
                first = mid + 1;
            }
        }
        return first;
    }
}