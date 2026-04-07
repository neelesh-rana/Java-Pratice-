package com.OOPS2.ARRAY;

public class Solution {

        public int[] plusOne(int[] digits) {

            for (int i = digits.length - 1; i >= 0; i--) {

                if (digits[i] < 9) {
                    digits[i]++;   // add 1
                    return digits; // done
                }

                digits[i] = 0; // if 9 → make 0 and carry
            }

            // if all were 9
            int[] result = new int[digits.length + 1];
            result[0] = 1;

            return result;
        }

    public static void main(String[] args) {

    }
}
