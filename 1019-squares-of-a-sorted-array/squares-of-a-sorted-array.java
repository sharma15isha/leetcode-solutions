class Solution {
    public int[] sortedSquares(int[] nums) {
       int[] result=new int[nums.length];
       int start=0;
       int end=nums.length-1;
       int k=nums.length-1;

       while(start <= end){
        if(Math.abs(nums[end])> Math.abs(nums[start])){
            result[k]=nums[end]*nums[end];
            end--;
        }
        else{
            result[k]=nums[start]*nums[start];
            start++;
        }
        k--;
       }
       return result;
    }
}