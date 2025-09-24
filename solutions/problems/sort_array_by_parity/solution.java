class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] temp = new int[nums.length]; // Initialize temp with the correct size
        int ind = 0;

        // Place even numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                temp[ind] = nums[i];
                ind++;
            }
        }

        // Place odd numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                temp[ind] = nums[i]; // Use 'ind' to continue adding to temp
                ind++;
            }
        }
        return temp;
    }
}