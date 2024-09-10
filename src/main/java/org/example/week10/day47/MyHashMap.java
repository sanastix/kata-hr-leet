package org.example.week10.day47;

import java.util.Arrays;

public class MyHashMap {

    private int[] map;
    private static final int DEFAULT_VALUE = -1;

    public MyHashMap() {
        map = new int[1000001];
        Arrays.fill(map, DEFAULT_VALUE);
    }

    public void put(int key, int value) {
        map[key] = value;
    }

    public int get(int key) {
        return map[key];
    }

    public void remove(int key) {
        map[key] = DEFAULT_VALUE;
    }

    /**
     * Your MyHashMap object will be instantiated and called as such:
     * MyHashMap obj = new MyHashMap();
     * obj.put(key,value);
     * int param_2 = obj.get(key);
     * obj.remove(key);
     */

}
