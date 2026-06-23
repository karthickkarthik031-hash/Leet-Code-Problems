class Solution {
    public int[] runningSum(int[] nums) {
        int a[]=new int [nums.length];
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+nums[i];
            a[i]=sum;
        }
        return a;
    }
}