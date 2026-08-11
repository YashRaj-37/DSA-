class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int k = s1.length();

        if (k > s2.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // Frequency of s1
        for (int i = 0; i < k; i++) {
            char c = s1.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int low = 0;
        int high = k - 1;

        HashMap<Character, Integer> map2 = new HashMap<>();

        // First window
        for (int i = low; i <= high; i++) {
            char c = s2.charAt(i);
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        while (high < s2.length()) {

            // Check current window
            if (map.equals(map2)) {
                return true;
            }

            // Remove left character
            char left = s2.charAt(low);

            map2.put(left, map2.get(left) - 1);

            if (map2.get(left) == 0) {
                map2.remove(left);
            }

            // Move window
            low++;
            high++;

            // Add new character
            if (high < s2.length()) {
                char h = s2.charAt(high);
                map2.put(h, map2.getOrDefault(h, 0) + 1);
            }
        }

        return false;
    }
}