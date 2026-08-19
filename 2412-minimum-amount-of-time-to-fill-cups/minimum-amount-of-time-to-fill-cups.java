class Solution {
    public int fillCups(int[] amount) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        int sum=0;

        for(int i=0;i<amount.length;i++){
            pq.add(amount[i]);
            sum+=amount[i];
        }
        int max=pq.peek();
        return Math.max(max,(sum+1)/2);
    }
}