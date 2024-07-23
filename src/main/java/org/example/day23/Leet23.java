package org.example.day23;

import java.util.Collections;
import java.util.PriorityQueue;

public class Leet23 {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            heap.add(stone);
        }
        while (heap.size() > 1) {
            int first = heap.poll();
            int second = heap.poll();
            if (first != second) heap.add(first - second);
        }
        return heap.isEmpty() ? 0 : heap.poll();
    }

}
