class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // 1. Frequency count
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 2. Max Heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
            (a, b) -> map.get(b) - map.get(a)
        );

        // Put all unique elements into heap
        for (int num : map.keySet()) {
            maxHeap.offer(num);
        }

        // 3. Take top k elements
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll();
        }

        return result;
    }
}