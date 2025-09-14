class Solution {
    public int minSubArrayLen(int target, int[] nums) {
    int n = nums.length;
    int minLen = Integer.MAX_VALUE;
    int sum = 0;
    int left = 0;

    for (int right = 0; right < n; right++) {
        sum += nums[right];

        // shrink window from left while current sum >= target
        while (sum >= target) {
            minLen = Math.min(minLen, right - left + 1);
            sum -= nums[left];
            left++;
        }
    }

    // if we never found valid window
    return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
}

}