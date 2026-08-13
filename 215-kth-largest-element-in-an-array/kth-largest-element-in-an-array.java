class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();

        for(int i=0;i<nums.length;i++){
            pq.offer(nums[i]);

            if(pq.size()>k){
                pq.poll();
            }
        }
        int[] result=new int[k];
    for(int i=0;i<result.length;i++){
        result[i]=pq.poll();
    }
    int ans=result[0];
    return ans;
    }
}