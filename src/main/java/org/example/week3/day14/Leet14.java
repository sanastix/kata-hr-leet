package org.example.week3.day14;

public class Leet14 {

    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid;
        while(left <= right){
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

}
