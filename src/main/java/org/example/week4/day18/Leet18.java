package org.example.week4.day18;

import java.util.ArrayList;
import java.util.List;

class Leet18 {

    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int left = 0, right = list.size() - 1;
        while (left < right && list.get(left) == list.get(right)) {
            left++;
            right--;
        }
        return left >= right;
    }

}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

