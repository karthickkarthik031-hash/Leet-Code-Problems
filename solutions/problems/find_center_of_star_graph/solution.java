class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer,Integer>a=new HashMap<>();
        for(int i=0;i<edges.length;i++){
           for(int j=0;j<edges[i].length;j++){
            a.put(edges[i][j],a.getOrDefault(edges[i][j],0)+1);
        } 
        }
        int c=0;
        int d=0;
        for(Map.Entry<Integer,Integer>entry:a.entrySet()){
            if(c<entry.getValue()){
                c=entry.getValue();
                 d=entry.getKey();
            }
        }
        return d;
    }
}