class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // start from last digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;   // just add 1 and return
                return digits;
            }
            digits[i] = 0;     // if digit is 9, make it 0 and continue
        }

        // if all were 9 → need extra digit
        int[] result = new int[n + 1];
        result[0] = 1;  // e.g. 999 + 1 = 1000
        return result;
    }
}
