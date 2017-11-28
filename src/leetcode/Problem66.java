package leetcode;

/**
 * Created by Dennis on 11/18/2017.
 *
 *Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

 You may assume the integer do not contain any leading zero, except the number 0 itself.

 The digits are stored such that the most significant digit is at the head of the list.

 7 minutes, just had to handle edge case for new +1
 */
public class Problem66 {
    public int[] plusOne(int[] digits) {
        boolean carryOver = true;
        int i = digits.length-1;
        while(carryOver && i >= 0 ) {
            digits[i]++;
            if(digits[i] >= 10) {
                digits[i] = 0;
                i--;
            }
            else {
                carryOver = false;
            }
        }
        int[] result = digits;
        if(carryOver) {
            result = new int[digits.length+1];
            result[0] = 1;
            for(int j = 0; j < digits.length; j++) {
                result[j+1] = digits[j];
            }
        }
        return result;
    }
}
