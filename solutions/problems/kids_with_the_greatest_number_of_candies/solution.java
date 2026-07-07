class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int c[]=candies.clone();
        Arrays.sort(c);
        List<Boolean>a=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            int b=candies[i]+extraCandies;
            if(b>=c[c.length-1]){
                a.add(true);
            }
            else{
                a.add(false);
            }
        }
        return a;
    }
}