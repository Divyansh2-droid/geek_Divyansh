import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Step 1: Agar length hi same nahi hai, to kabhi bhi isomorphic nahi ho sakte
        if (s.length() != t.length()) return false;

        // Step 2: Ek map banate hai jisme s ka character -> t ka character store karenge
        Map<Character, Character> map = new HashMap<>();
        // Step 3: Ek set banate hai jisme t ke woh characters rakhenge jo already map ho chuke hai
        Set<Character> mapped = new HashSet<>();

        // Step 4: Dono strings ko ek saath character by character traverse karte hai
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);  // s ka character
            char c2 = t.charAt(i);  // t ka character

            // Case 1: Agar c1 pehle se map me hai
            if (map.containsKey(c1)) {
                // check karo ki woh same c2 pe map ho raha hai ya nahi
                if (map.get(c1) != c2) {
                    return false; // mismatch mil gaya
                }
            } else {
                // Case 2: Agar c1 pehle map me nahi hai
                // check karo ki c2 already kisi aur ke sath map hai ya nahi
                if (mapped.contains(c2)) {
                    return false; // ek t ka char do s ke char ke sath map nahi ho sakta
                }
                // safe hai → new mapping create kar do
                map.put(c1, c2);
                mapped.add(c2);
            }
        }

        // Step 5: Agar pura loop bina problem ke chal gaya → isomorphic hai
        return true;
    }
}
