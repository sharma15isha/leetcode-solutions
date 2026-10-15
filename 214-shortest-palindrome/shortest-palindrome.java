class Solution {
    public String shortestPalindrome(String s) {
        String rev=new StringBuilder(s).reverse().toString();
        String combined=s+"#"+rev;

        int m=combined.length();
        int[] lps=new int[m];
        int len=0;
        int i=1;

        while(i<m){
            if(combined.charAt(i) == combined.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len!=0){
                    len=lps[len-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        int palindrome=lps[m-1];
        String charsToAdd=rev.substring(0,s.length()-palindrome);
        return charsToAdd+s;
    }
}