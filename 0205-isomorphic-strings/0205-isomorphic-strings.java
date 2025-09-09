class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Character> map = new HashMap<>();
        Set<Character> mapped = new HashSet<>(); // to track already used chars in t

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (map.containsKey(c1)) {
                // check consistency
                if (map.get(c1) != c2) {
                    return false;
                }
            } else {
                // if c2 already used by another char, not isomorphic
                if (mapped.contains(c2)) {
                    return false;
                }
                map.put(c1, c2);
                mapped.add(c2);
            }
        }

        return true;
    }
}
