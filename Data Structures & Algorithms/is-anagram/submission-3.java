class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> m = new HashMap<>();
        char[] sChar = s.toCharArray();
        for(int i = 0; i < sChar.length; i++){
            int cur = m.get(sChar[i]) == null ? 1 : m.get(sChar[i]) + 1;
            m.put(sChar[i], cur);
        }
        Map<Character, Integer> m1 = new HashMap<>();
        char[] tChar = t.toCharArray();
        for(int i = 0; i < tChar.length; i++){
            int cur = m1.get(tChar[i]) == null ? 1 : m1.get(tChar[i]) + 1;
            m1.put(tChar[i], cur);
        }
        if(sChar.length != tChar.length) return false;
        for(int i = 0; i < tChar.length; i++){
            if(m.get(tChar[i]) == null || !m.get(tChar[i]).equals(m1.get(tChar[i]))){
                return false;
            }
        }
        
        return true;
        
    }
}
