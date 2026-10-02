class Solution {
    public int largestAltitude(int[] gain) {
       int[] altitude=new int[gain.length+1];

       for(int i=0;i<gain.length;i++){
        altitude[i+1]=altitude[i]+gain[i];
       } 
       int max=altitude[0];
       for(int i=1;i<altitude.length;i++){
        if(altitude[i]>max){
            max=altitude[i];
        }
       }
      return max;
    }
}