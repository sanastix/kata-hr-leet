package org.example.week7.day34;

public class Leet34 {

    public int maxDepth(String s) {
        int currentDepth = 0;
        int maxDepth = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                currentDepth++;
                maxDepth = Math.max(maxDepth, currentDepth);
            } else if (c == ')') {
                currentDepth--;
            }
        }

        return maxDepth;
    }

    /*public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        int maxDepth = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
                maxDepth = Math.max(maxDepth, stack.size());
            } else if (c == ')') {
                stack.pop();
            }
        }

        return maxDepth;
    }*/

}
