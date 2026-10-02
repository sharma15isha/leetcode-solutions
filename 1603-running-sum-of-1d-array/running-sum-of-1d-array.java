class Solution {
    public int[] runningSum(int[] nums) {
        int[] prefix=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            prefix[i]=sum+nums[i];
            sum=prefix[i];
        }
        return prefix;

    }
}