class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer>a=new HashMap<>();
        int sum=0;
        int sum1=0;
        for(int i=0;i<s.length();i++){
            a.put(s.charAt(i),a.getOrDefault(s.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer>entry : a.entrySet()){
            if(entry.getKey()=='a'||entry.getKey()=='e'||entry.getKey()=='i'||entry.getKey()=='o'||entry.getKey()=='u'){
                if(sum<entry.getValue()){
                sum=entry.getValue();
            }}
            else{
                if(sum1<entry.getValue()){
                sum1=entry.getValue();
            }}
        }
        return sum+sum1;
    }
}