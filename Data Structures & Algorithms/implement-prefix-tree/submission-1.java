class PrefixTree {
    PrefixTree[] children;
    boolean isEnd;
    public PrefixTree() {
         children = new PrefixTree[26]; 
         isEnd = false;
    }

    public void insert(String word) {
        PrefixTree cur = this;
        for(char c : word.toCharArray()){
            //build new node
            if(cur.children[c - 'a'] == null){
                cur.children[c - 'a'] = new PrefixTree();
            }
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

    private PrefixTree traverse(String word){
        PrefixTree cur = this;
        for(char c : word.toCharArray()){
            //build new node
            if(cur.children[c - 'a'] == null){
               return null;
            }
            cur = cur.children[c - 'a'];
            
        }
        return cur;
    }
}
