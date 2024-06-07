class Solution {
    public int[] buildArray(int[] nums) {
        int[] permutedArray = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            permutedArray[i] = nums[nums[i]];
        }
        return permutedArray;
    }
}
