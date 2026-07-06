class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=2*nums.length;
        int a[]=new int[n];
        for(int i=0;i<nums.length;i++){
            a[i]=nums[i];
            a[i+nums.length]=nums[i];
        }
        return a;
    }
}