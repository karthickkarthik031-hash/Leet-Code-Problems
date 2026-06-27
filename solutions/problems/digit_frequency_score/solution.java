class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> a = new HashMap<>();
        int sum=0;
        while(n>0){
            int k=n%10;
            a.put(k,a.getOrDefault(k,0)+1);
            n=n/10;
        }
        for (Map.Entry<Integer, Integer> entry : a.entrySet()) {
           sum += entry.getKey() * entry.getValue();
        }
        return sum;
    }
}