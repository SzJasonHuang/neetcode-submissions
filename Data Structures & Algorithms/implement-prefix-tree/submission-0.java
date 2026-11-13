class PrefixTree {
    private PrefixTree[] children;
    private boolean isEnd;
    public PrefixTree() {
        children = new PrefixTree[26];
        isEnd = false;
    }

    public void insert(String word) {
        PrefixTree cur = this; 
        for(char c : word.toCharArray()){
            if(cur.children[c - 'a'] != null){
                cur = cur.children[c - 'a'];
                continue;
            };
            cur.children[c - 'a'] = new PrefixTree();
            cur = cur.children[c - 'a'];
        }
        cur.isEnd = true;
    }

    public boolean search(String word) {
        PrefixTree node = traverse(word);
        return node != null && node.isEnd;
    }

    public boolean startsWith(String prefix) {
        PrefixTree node = traverse(prefix); 
        return node != null;
    }


    public PrefixTree traverse(String word){
        PrefixTree node = this;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                return null;
            }
            node = node.children[index];
        }
        return node;
    }
}
