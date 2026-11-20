class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        String first = strs[0];

        for (int i = 0; i < first.length(); i++) {
            char expected = first.charAt(i);

            for (int j = 1; j < strs.length; j++) {
                String word = strs[j];

                if (i >= word.length() || word.charAt(i) != expected) {
                    return first.substring(0, i);
                }
            }
        }

        return first;
    }
}