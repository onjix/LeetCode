class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int size=0;
        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
            if(map.get(ch) % 2 ==1) {
                size++;
            }
            else {
                size--;
            }
        }
        if(size > 1) {
            return s.length() - size + 1;
        }
        return s.length();
    }
}