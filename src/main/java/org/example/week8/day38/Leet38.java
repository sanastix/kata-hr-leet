package org.example.week8.day38;

public class Leet38 {

    //a⊕a=0: Any number XORed with itself will result in 0
    //a⊕0=a: Any number XORed with 0 will result in the number itself
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

}
