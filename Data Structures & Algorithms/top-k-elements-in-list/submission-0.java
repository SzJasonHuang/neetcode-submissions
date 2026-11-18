class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        int[] result = new int[k]; 
        for(int i = 0; i < nums.length; i++){
            int cur = m.get(nums[i]) == null? 1 : m.get(nums[i]) + 1; 
            m.put(nums[i], cur);
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> m.get(a) - m.get(b));
        for(int cur : m.keySet()){
            minHeap.offer(cur);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        for(int i = 0; i < k; i++){
            result[i] = minHeap.poll();
        }
        return result;

    }
}
