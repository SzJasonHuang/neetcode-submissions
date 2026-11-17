class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> m = new HashMap<>();

        for (String word : strs) {
            
            int[] charCount = new int[26];
            for (char c : word.toCharArray()) {
                charCount[c - 'a']++;
            }
            StringBuilder keyBuilder = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (charCount[i] > 0) {
                    char ch = (char) (i + 'a');
                    keyBuilder.append(ch).append(":").append(charCount[i]).append(",");
                }
            }
            String key = keyBuilder.toString();

           
            m.putIfAbsent(key, new ArrayList<>());
            m.get(key).add(word);
        }

        return new ArrayList<>(m.values());
    }
}