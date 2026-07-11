class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer>a=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            a.put(nums[i],a.getOrDefault(nums[i],0)+1);
        }
        int b=0;
        for(Map.Entry<Integer,Integer>entry:a.entrySet()){
            if(entry.getValue()==1){
                b=entry.getKey();
            }
        }
        return b;
    }
}