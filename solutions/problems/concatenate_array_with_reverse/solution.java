class Solution {
    public int[] concatWithReverse(int[] nums) {
        int a[] =new int [2*nums.length];
        for(int i=0;i<a.length;i++){
            if(i<a.length/2){
                a[i]=nums[i];
            }
            else
            {
                a[i]=nums[a.length-1-i];
            }
        }
        return a;
    }
}