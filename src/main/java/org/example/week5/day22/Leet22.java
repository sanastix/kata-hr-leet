package org.example.week5.day22;

import java.util.PriorityQueue;

public class Leet22 {

    /**
     * Your KthLargest/Leet22 object will be instantiated and called as such:
     * KthLargest obj = new KthLargest(k, nums);
     * int param_1 = obj.add(val);
     */

    private final PriorityQueue<Integer> minHeap;
    private final int k;

    public Leet22(int k, int[] nums) {
        this.k = k;
        this.minHeap = new PriorityQueue<>(k);

        // The constructor initializes the min-heap with the given stream of numbers
        // It ensures that only the k largest elements are kept in the heap
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        // If the size of the heap is less than k, the new value is added directly
        // If the heap already contains k elements, the new value is only added
        // if it is larger than the smallest value (the root of the heap)
        // In this case, the root of the heap is removed, and the new value
        // is added to maintain the size of the heap
        if (minHeap.size() < k) {
            minHeap.offer(val);
        } else if (val > minHeap.peek()){
            minHeap.poll();
            minHeap.offer(val);
        }
        return minHeap.peek();
    }

}
