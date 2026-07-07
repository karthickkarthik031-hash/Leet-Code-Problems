class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int a=0;
        for(int i=0;i<nums.length;i++){
            int j=nums[i];
            while(j>0){
                int n=j%10;
                if(n==digit){
                    a++;
                }
                j=j/10;
            }
        }
        return a;
    }
}