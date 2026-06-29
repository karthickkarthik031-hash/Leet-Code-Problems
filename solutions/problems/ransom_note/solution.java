class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> a = new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            a.put(magazine.charAt(i),a.getOrDefault(magazine.charAt(i),0)+1);
        }
        for(int i=0;i<ransomNote.length();i++){
            if(a.containsKey(ransomNote.charAt(i))&&a.get(ransomNote.charAt(i))!=0)
            {
                a.put(ransomNote.charAt(i),a.get(ransomNote.charAt(i))-1);
            }
            else{
                return false;
            }
        }
        return true;
    }
}