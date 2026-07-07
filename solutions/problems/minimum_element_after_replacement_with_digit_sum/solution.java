class Solution {
    public int minElement(int[] nums) {
        List<Integer>c=new ArrayList<>();
        int sum=0;
        int a=0;
        int b=0;
        for(int i=0;i<nums.length;i++){
            b=nums[i];
            sum=0;
            while(b>0){
                a=b%10;
                sum=sum+a;
                b=b/10;
            }
            c.add(sum);
        }
        Collections.sort(c);
        return c.get(0);
    }
}