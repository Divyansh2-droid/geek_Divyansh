class Solution {
    public int distributeCandies(int[] candyType) {
        // Use a HashSet to count unique candy types
        Set<Integer> set = new HashSet<>();
        for (int candy : candyType) {
            set.add(candy);
        }
        
        // Max candies sister can eat = n / 2
        int maxCandies = candyType.length / 2;
        
        // The result is the smaller of unique types vs maxCandies
        return Math.min(set.size(), maxCandies);
    }
}
