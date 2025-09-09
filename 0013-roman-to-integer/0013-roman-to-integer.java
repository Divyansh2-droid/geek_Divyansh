class Solution {
    public int romanToInt(String s) {
        // Step 1: Ek map banate hai jisme har Roman symbol ki value store karenge
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0; // yaha final result store hoga

        // Step 2: String ke har character ko loop karte hain
        for (int i = 0; i < s.length(); i++) {
            int value = map.get(s.charAt(i)); // current roman ki value nikaali

            // Step 3: Check karo kya next character ki value current se badi hai?
            // Example: IV → I(1) ke baad V(5), yaha 1 < 5 → iska matlab subtraction rule lagega
            if (i + 1 < s.length() && value < map.get(s.charAt(i + 1))) {
                total -= value; // subtraction rule: current value minus kar do
            } else {
                total += value; // otherwise normal addition rule lagta hai
            }
        }

        // Step 4: Final total return karo
        return total;
    }
}
