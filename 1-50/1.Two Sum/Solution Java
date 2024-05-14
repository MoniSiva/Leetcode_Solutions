import java.lang.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        int res_l = 0,res_r = 0;
        int[] values = new int[2];
        for(int i = 0;i<nums.length-1;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    values[0] = i;
                    values[1] = j;
                    break;
                }
            }
        }
        return values;
    }
}
