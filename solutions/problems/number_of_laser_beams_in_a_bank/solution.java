class Solution {
    public int numberOfBeams(String[] bank) {
        List<Integer>a=new ArrayList<>();
        for(int i=0;i<bank.length;i++){
            int count=0;
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1'){
                    count++;
                }
            }
            System.out.print(count);
            if(count!=0){
            a.add(count);
            
        }}
        int sum=0;
        int sum1=0;
        for(int i=1;i<a.size();i++){
            sum=a.get(i-1)*a.get(i);
            sum1=sum1+sum;
        }
        return sum1;
    }
}