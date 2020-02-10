package array;

import java.util.Arrays;

public class PlusOne {

    // linear complexity
    public int[] plusOne(int[] digits) {
        int[] plusOne = Arrays.copyOf(digits, digits.length);
        for (int i = plusOne.length-1; i >= 0; i--) {
            if (plusOne[i] == 9) {
                plusOne[i] = 0;
            }
            else {
                plusOne[i]++;
                return plusOne;
            }
        }
        if (plusOne[0] == 0) {
            plusOne = new int[plusOne.length+1];
            plusOne[0] = 1;
        }
        return plusOne;
    }

    public int[] plusOne2(int[] digits) {
        int[] plusOne;
        if (digits[digits.length - 1] != 9) {
            plusOne = new int[digits.length];
            System.arraycopy(digits, 0, plusOne, 0, digits.length);
            plusOne[plusOne.length-1]++;
        } else {
            int i = digits.length-1;
            while(i >= 0 && digits[i] == 9) {
                i--;
            }
            if (i == -1) {
                plusOne = new int[digits.length+1];
                Arrays.fill(plusOne, 1, plusOne.length-1, 0);
                plusOne[0] = 1;
            }
            else {
                plusOne = new int[digits.length];
                Arrays.fill(plusOne, i+1, plusOne.length-1, 0);
                System.arraycopy(digits, 0, plusOne, 0, i+1);
                plusOne[i]++;
            }
        }
        return plusOne;
    }
}
