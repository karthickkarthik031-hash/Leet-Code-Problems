class Solution {
    public String convertDateToBinary(String date) {
        String a[]=date.split("-");
        String d="";
        for(int i=0;i<a.length;i++){
            int b=Integer.parseInt(a[i]);
            String c=Integer.toString(b,2);
            d=d+c;
            if(i<a.length-1){
            d=d+'-';}
        }
        return d;
    }
}