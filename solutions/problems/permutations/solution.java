import java.util.*;

class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {

        ArrayList<Integer> temp = new ArrayList<>();

        boolean used[] = new boolean[nums.length];

        backtrack(nums, temp, used);

        return ans;
    }

    void backtrack(int[] nums,
                   ArrayList<Integer> temp,
                   boolean[] used){

        // Base case
        if(temp.size() == nums.length){

            ans.add(new ArrayList<>(temp));

            return;
        }

        for(int i=0;i<nums.length;i++){

            if(used[i])
                continue;

            // Choose
            temp.add(nums[i]);
            used[i]=true;

            // Recurse
            backtrack(nums,temp,used);

            // Undo
            temp.remove(temp.size()-1);
            used[i]=false;

        }

    }

}