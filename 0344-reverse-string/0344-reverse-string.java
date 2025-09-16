class Solution {
    public void reverseString(char[] s) {
        helper(s, 0, s.length - 1);
    }

    private void helper(char[] s, int left, int right) {
        if (left >= right) return; // base case

        // swap characters
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        // recursive call
        helper(s, left + 1, right - 1);
    }
}
