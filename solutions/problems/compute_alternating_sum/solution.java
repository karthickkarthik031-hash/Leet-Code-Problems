class Solution {
    public int alternatingSum(int[] nums) {
        int s=0;
        int t=1;
        for(int i=0;i<nums.length;i++){
            s+=t*nums[i];
            t=t*-1;
        }
        return s;
    }
}