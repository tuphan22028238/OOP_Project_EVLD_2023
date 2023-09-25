import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Dictionary {
    /**
     * The root of the Trie tree stores words.
     */
    public TrieNode root = new TrieNode();
    /**
     * The list stores all the words.
     * The words in the list are not duplicates and are arranged in lexicographic order
     */
    public SortedSet<Word> allWord = new TreeSet<>(new Comparator<Word>() {
        @Override
        public int compare(Word o1, Word o2) {
            StringBuffer s1 = o1.wordTarget;
            StringBuffer s2 = o2.wordTarget;
            for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
                if (s1.charAt(i) < s2.charAt(i)) {
                    return -1;
                } else if (s1.charAt(i) > s2.charAt(i)) {
                    return 1;
                } else {
                    continue;
                }
            }
            return Integer.compare(s1.length(), s2.length());
        }
    });

    /**
     * Default constructor without parameter.
     */
    public Dictionary() {};
}
