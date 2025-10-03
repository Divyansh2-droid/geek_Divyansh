class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0; // pointer for placement
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i]; // keep the element
                count++;
            }
        }
        return count; // new length
    }
}
