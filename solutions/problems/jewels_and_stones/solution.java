class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer>a=new HashMap<>();
        int sum=0;
        for(int i=0;i<stones.length();i++){
            a.put(stones.charAt(i),a.getOrDefault(stones.charAt(i),0)+1);
        }
        for(int i=0;i<jewels.length();i++){
            if(a.containsKey(jewels.charAt(i))){
                sum=sum+a.get(jewels.charAt(i));
            }
        }
        return sum;
    }
}