class Solution {
    public int maxProduct(int[] nums) {
        int maxEndingHere = nums[0];
        int minEndingHere = nums[0];
        int maxProd = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            // If number is negative, swap max and min
            if (num < 0) {
                int temp = maxEndingHere;
                maxEndingHere = minEndingHere;
                minEndingHere = temp;
            }

            maxEndingHere = Math.max(num, maxEndingHere * num);
            minEndingHere = Math.min(num, minEndingHere * num);

            maxProd = Math.max(maxProd, maxEndingHere);
        }

        return maxProd;
    }
}
