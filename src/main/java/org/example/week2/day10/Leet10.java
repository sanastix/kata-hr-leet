package org.example.week2.day10;

import java.util.Stack;

public class Leet10 {

    public int calPoints(String[] operations) {
        Stack<Integer> records = new Stack<>();
        for (String operation : operations) {
            switch (operation) {
                case "+":
                    int last = records.pop();
                    int sum = last + records.peek();
                    records.push(last);
                    records.push(sum);
                    break;
                case "C":
                    records.pop();
                    break;
                case "D":
                    records.push(records.peek() * 2);
                    break;
                default:
                    records.push(Integer.valueOf(operation));
                    break;
            }
        }
        int result = 0;
        for (int res : records) {
            result += res;
        }
        return result;
    }

}
